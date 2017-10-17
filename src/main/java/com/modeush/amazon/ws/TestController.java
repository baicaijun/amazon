package com.modeush.amazon.ws;

import com.modeush.amazon.constant.ErrorConstant;
import com.modeush.amazon.entity.ResultEntity;
import com.modeush.amazon.util.CHException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class TestController {

    @ResponseBody
    @RequestMapping(value="v1/test",method= RequestMethod.GET)
    public String getGeneratorInfo(){
        try{
            return "success";
        }catch (Exception e) {
            e.printStackTrace();
            return "success";
        }
    }
}
