package com.modeush.amazon.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.modeush.amazon.constant.CommonConstant;
import com.modeush.amazon.constant.ErrorConstant;
import com.modeush.amazon.dao.*;
import com.modeush.amazon.entity.*;
import com.modeush.amazon.signin.AmozonRegister;
import com.modeush.amazon.util.CHException;
import com.sun.tracing.dtrace.ArgsAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 进行注册的操作；
 * 查询库里未使用过的基本信息，进行注册，然后将信息存入user表
 * 将未使用的状态改成已使用状态
 */
@Service
public class AmazonRegisterService {
    @Autowired
    AzUserEntityMapper userDao;
    @Autowired
    GeneratorDao generatorDao;
    @Autowired
    AzActionDomElementEntityMapper elementDao;
    @Autowired
    AzUserActionEntityMapper userActionDao;
    @Autowired
    AzUserBasicInfoEntityMapper baseInfoDao;


    public ResultEntity register(String bodyStr) {
        ResultEntity result = new ResultEntity();
        AmozonRegister amazonR = new AmozonRegister();
      //  RequestEntity request = new RequestEntity();
        AzUserActionEntity usreActionEntity = new AzUserActionEntity();
        try {
        //    request = JSON.parseObject(bodyStr, RequestEntity.class);
            /**
             List<GeneratorEntity> geneList = generatorDao.selectAllGenetorEntity();
             if (geneList == null || geneList.size() <= 0) {
             throw new CHException(CommonConstant.SUCCESS_STATUS, CommonConstant.SUCCESS);
             }
             */
            if(bodyStr==null){
                throw new CHException(ErrorConstant.ERROR_10003,ErrorConstant.ERROR_10003_STR);
            }
             usreActionEntity = userActionDao.selectByPrimaryKey(Integer.parseInt(bodyStr));
            if (usreActionEntity == null) {
                throw new CHException(ErrorConstant.ERROR_10001,ErrorConstant.ERROR_10001_STR);
            }
            List<AzActionDomElementEntity> registerDomElementList = elementDao.selectGroupDomElement(Long.parseLong(usreActionEntity.getActionGroupId()));
            JSONObject elementJson = new JSONObject();
            for (AzActionDomElementEntity element : registerDomElementList) {
                String path = element.getElementPath();
                String name = element.getElementName();
                elementJson.put(name, path);
            }
            AzUserEntity userEntity = userDao.selectByPrimaryKey(Integer.parseInt(usreActionEntity.getUserId()));

            if (userEntity == null) {
                throw new CHException(ErrorConstant.ERROR_10001,ErrorConstant.ERROR_10001_STR);
            }
            if (userEntity.getBasicInfoId() == null) {
                throw new CHException(ErrorConstant.ERROR_10002, ErrorConstant.ERROR_10002_STR);
            }
            if(userEntity.getBrowser()==null){
                throw new CHException(ErrorConstant.ERROR_10005, ErrorConstant.ERROR_10005_STR);
            }
            AzUserBasicInfoEntity basicInfoEntity = baseInfoDao.selectByPrimaryKey(userEntity.getBasicInfoId());
            if (basicInfoEntity == null) {
                throw new CHException(ErrorConstant.ERROR_10003, ErrorConstant.ERROR_10003_STR);
            }
            AzUserEntity user = amazonR.registerAmazonUser(basicInfoEntity, userEntity.getBrowser(), elementJson);
            if (user != null) {
                userEntity.setLevel(user.getLevel());
                userEntity.setStatus(user.getStatus());
                userDao.updateByPrimaryKey(userEntity);
            }
            basicInfoEntity.setStatus("1");//更新基本信息表，标注已经使用过
            baseInfoDao.updateByPrimaryKey(basicInfoEntity);
            result.setErrorNum(CommonConstant.SUCCESS_STATUS);
            result.setMessage(CommonConstant.SUCCESS);
        } catch (CHException e) {
            AzUserActionEntity usreActionEntityUp = userActionDao.selectByPrimaryKey(Integer.parseInt(bodyStr));
            usreActionEntityUp.setStatus("2");
            userActionDao.updateByPrimaryKey(usreActionEntityUp);
            result.setErrorNum(e.getErrCode());
            result.setMessage(e.getErrMsg());
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            AzUserActionEntity usreActionEntityUp = userActionDao.selectByPrimaryKey(Integer.parseInt(bodyStr));
            usreActionEntityUp.setStatus("2");
            userActionDao.updateByPrimaryKey(usreActionEntityUp);
            result.setErrorNum(ErrorConstant.ERROR_10006);
            result.setMessage(ErrorConstant.ERROR_10006_STR);
            return result;
        }
        return result;
    }
}
