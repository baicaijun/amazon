package com.modeush.amazon.ws;

import com.modeush.amazon.config.Constant;
import com.modeush.amazon.constant.ErrorConstant;
import com.modeush.amazon.entity.ResultEntity;
import com.modeush.amazon.service.generatorService;
import com.modeush.amazon.util.CHException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GeneratorController {
    @Autowired
    generatorService ge;
    @ResponseBody
    @RequestMapping(value="v1/generator/info",method= RequestMethod.GET)
    public ResultEntity getGeneratorInfo(@RequestParam(value = "browser_name", required = false) String browserName ){
        ResultEntity result = new ResultEntity();
        try{
            if(browserName==null){
                browserName= Constant.CHROME_BROWSER_NAME;
            }
            result=ge.addUserInfo(browserName);
        }catch (Exception e) {
            if (e.getCause() != null && e.getCause() instanceof CHException) {
                CHException isException = (CHException) e.getCause();
                result.setErrorNum(isException.getErrCode());
                result.setMessage(isException.getErrMsg());
            } else {
                result.setErrorNum(ErrorConstant.ERROT_10000);
                result.setMessage(ErrorConstant.ERROR_10000_MSG);
            }
            return result;
        }
        return result;
    }
}
