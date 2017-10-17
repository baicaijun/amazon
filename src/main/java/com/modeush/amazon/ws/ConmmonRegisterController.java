package com.modeush.amazon.ws;

import com.modeush.amazon.constant.ErrorConstant;
import com.modeush.amazon.entity.ResultEntity;
import com.modeush.amazon.service.AmazonRegisterService;
import com.modeush.amazon.util.CHException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 普通注册，直接打开链接进行注册
 *
 */
@Controller
public class ConmmonRegisterController {
    @Autowired
    AmazonRegisterService register;
    @ResponseBody
    @RequestMapping(value="v1/register/common",method= RequestMethod.GET)
    public ResultEntity getGeneratorInfo(@RequestParam(value = "userActionId", required = false) String userActionId ){
        ResultEntity result = new ResultEntity();
        try{
            result=register.register(userActionId);
        }catch (Exception e) {
            e.printStackTrace();
            if (e.getCause() != null && e.getCause() instanceof CHException) {
                CHException isException = (CHException) e.getCause();
                result.setErrorNum(isException.getErrCode());
                result.setMessage(isException.getErrMsg());
            } else {
                result.setErrorNum(ErrorConstant.ERROR_10006);
                result.setMessage(ErrorConstant.ERROR_10006_STR);
            }
            return result;
        }
        return result;
    }
}
