package com.modeush.amazon.service;

import com.alibaba.fastjson.JSONObject;
import com.modeush.amazon.config.Constant;
import com.modeush.amazon.constant.CommonConstant;
import com.modeush.amazon.constant.ErrorConstant;
import com.modeush.amazon.dao.AzActionDomElementEntityMapper;
import com.modeush.amazon.dao.GeneratorDao;
import com.modeush.amazon.entity.AzActionDomElementEntity;
import com.modeush.amazon.entity.GeneratorEntity;
import com.modeush.amazon.entity.ResultEntity;
import com.modeush.amazon.generator.CrawlingGeneratorInformation;
import com.modeush.amazon.util.CHException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收集用户的基本信息
 */
@Service
public class generatorService {
    @Autowired
    GeneratorDao geDao;
    @Autowired
    AzActionDomElementEntityMapper elementDao;

    public ResultEntity addUserInfo(String body) {
        ResultEntity result = new ResultEntity();
        try {
            CrawlingGeneratorInformation cr = new CrawlingGeneratorInformation();
            List<AzActionDomElementEntity> registerDomElementList = elementDao.selectGroupDomElement(1l);
            JSONObject elementJson = new JSONObject();
            for(AzActionDomElementEntity element:registerDomElementList){
                String path=element.getElementPath();
                String name=element.getElementName();
                elementJson.put(name,path);
            }
            GeneratorEntity generatorInformation = cr.getGeneratorInformation(Constant.GENERATOR_URL, elementJson, body);
            int i=geDao.insert(generatorInformation);
            System.out.println(i);
            result.setMessage(CommonConstant.SUCCESS);
            result.setErrorNum(CommonConstant.SUCCESS_STATUS);
        } catch (CHException e) {
            result.setErrorNum(e.getErrCode());
            result.setMessage(e.getErrMsg());
            return result;
        } catch (Exception e) {
            result.setErrorNum(ErrorConstant.ERROT_10000);
            result.setMessage(ErrorConstant.ERROR_10000_MSG);
            return result;
        }
        return result;
    }

}
