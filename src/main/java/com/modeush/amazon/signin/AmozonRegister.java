package com.modeush.amazon.signin;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.modeush.amazon.base.InitDriver;
import com.modeush.amazon.config.Constant;
import com.modeush.amazon.entity.AzUserBasicInfoEntity;
import com.modeush.amazon.entity.AzUserEntity;
import com.modeush.amazon.entity.GeneratorEntity;
import com.modeush.amazon.signin.dompath.AmazonRegisterDomElement;
import com.modeush.amazon.util.CHException;
import com.modeush.amazon.util.WebDriverApi;
import org.openqa.selenium.WebDriver;

public class AmozonRegister extends InitDriver{

    public AzUserEntity registerAmazonUser(AzUserBasicInfoEntity baseInfoEntity, String BrowserName, Object obj)throws CHException,Exception{
        WebDriver driver =InitDriver.init(BrowserName);
        AzUserEntity amazonUser = new AzUserEntity();
        JSONObject elementJson =  JSON.parseObject(JSON.toJSONString(obj));
        driver.get(Constant.AMAZON_URL);
        WebDriverApi.waitForLoad(driver);
        WebDriverApi.ExcuClick(elementJson.getString(AmazonRegisterDomElement.AMAZON_RESIGTER_LINK),driver);
        WebDriverApi.waitForLoad(driver);
        WebDriverApi.ExcuClick(elementJson.getString(AmazonRegisterDomElement.CREATE_ACCOUNT_BTN),driver);
        WebDriverApi.waitForLoad(driver);
        WebDriverApi.ExcuClear(elementJson.getString(AmazonRegisterDomElement.AMZZON_REGISTER_USER_NAME),driver);
        WebDriverApi.ExcuSendKey(elementJson.getString(AmazonRegisterDomElement.AMZZON_REGISTER_USER_NAME),baseInfoEntity.getUserName(),driver);
        WebDriverApi.sleepThread(Constant.COMMON_SLEEP_TIME);
        WebDriverApi.ExcuClear(elementJson.getString(AmazonRegisterDomElement.AMZZON_REGISTER_EMAIL),driver);
        WebDriverApi.ExcuSendKey(elementJson.getString(AmazonRegisterDomElement.AMZZON_REGISTER_EMAIL),baseInfoEntity.getEmail(),driver);
        WebDriverApi.sleepThread(Constant.COMMON_SLEEP_TIME);
        WebDriverApi.ExcuClear(elementJson.getString(AmazonRegisterDomElement.AMZZON_REGISTER_PASSWORD),driver);
        WebDriverApi.ExcuSendKey(elementJson.getString(AmazonRegisterDomElement.AMZZON_REGISTER_PASSWORD),baseInfoEntity.getPassword(),driver);
        WebDriverApi.sleepThread(Constant.COMMON_SLEEP_TIME);
        WebDriverApi.ExcuClear(elementJson.getString(AmazonRegisterDomElement.AMZZON_REGISTER_PASSWORD_AGAIN),driver);
        WebDriverApi.ExcuSendKey(elementJson.getString(AmazonRegisterDomElement.AMZZON_REGISTER_PASSWORD_AGAIN),baseInfoEntity.getPassword(),driver);
        WebDriverApi.sleepThread(Constant.COMMON_SLEEP_TIME);
        WebDriverApi.ExcuClick(elementJson.getString(AmazonRegisterDomElement.CREATE_COUNT),driver);
        WebDriverApi.sleepThread("5000");
        WebDriverApi.closeChrome(driver);
       // amazonUser.setBasicInfoId(baseInfoEntity.getId());//关联基本信息id
        amazonUser.setStatus(0);//未使用
        amazonUser.setLevel(1);//龙套账户
        return amazonUser;
    }




    public static void main(String[] args)throws Exception{
        AmozonRegister register = new AmozonRegister();
        GeneratorEntity base= new GeneratorEntity();
        base.setUserName("chenyixiao");
        base.setEmail("523371753@qq.com");
        base.setPassword("chenyixiao");
        base.setId(1);
      //  register.registerAmazonUser(base,"chrome","Str");
    }

}
