package com.modeush.amazon.generator;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.modeush.amazon.base.InitDriver;
import com.modeush.amazon.constant.ErrorConstant;
import com.modeush.amazon.entity.GeneratorEntity;
import com.modeush.amazon.util.CHException;
import com.modeush.amazon.util.WebDriverApi;
import org.openqa.selenium.WebDriver;
import com.modeush.amazon.generator.dompath.*;

import java.util.Timer;
import java.util.TimerTask;

public class CrawlingGeneratorInformation extends InitDriver{

    public GeneratorEntity getGeneratorInformation(String url,Object obj,String BrowserName) throws Exception{
        try{
            GeneratorEntity generatorEntity = new GeneratorEntity();
            JSONObject elementJson = JSON.parseObject(JSON.toJSONString(obj));
            WebDriver driver=InitDriver.init(BrowserName);;
            driver.get(url);
            WebDriverApi.waitForLoad(driver);
           // WebDriverApi.ExcuClick(GeneratorDomElement.RANDOM_BTN,driver);
            String address=WebDriverApi.getText(elementJson.getString(GeneratorDomElement.ADDRESS),driver);
            System.out.println("address"+address);
            String age=WebDriverApi.getText(elementJson.getString(GeneratorDomElement.AGE),driver);
            System.out.println("age"+age);
            String birthDay=WebDriverApi.getText(elementJson.getString(GeneratorDomElement.BIRTHDAY),driver);
            System.out.println("birthDay"+birthDay);
            String bloodType=WebDriverApi.getText(elementJson.getString(GeneratorDomElement.BLOOD_TYPE),driver);
            System.out.println("bloodType"+bloodType);
            String company=WebDriverApi.getText(elementJson.getString(GeneratorDomElement.COMPANY),driver);
            System.out.println("company"+company);
            String contryCode=WebDriverApi.getText(elementJson.getString(GeneratorDomElement.COUNTRY_CODE),driver);
            System.out.println("contryCode"+contryCode);
            String height=WebDriverApi.getText(elementJson.getString(GeneratorDomElement.HEIGHT),driver);
            System.out.println("height"+height);
            String name=WebDriverApi.getText(elementJson.getString(GeneratorDomElement.NAME),driver);
            System.out.println("name"+name);
            String occupation=WebDriverApi.getText(elementJson.getString(GeneratorDomElement.OCCUPATION),driver);
            System.out.println("occupation"+occupation);
            String phone=WebDriverApi.getText(elementJson.getString(GeneratorDomElement.PHONE),driver);
            System.out.println("phone"+phone);
            String ssn=WebDriverApi.getText(elementJson.getString(GeneratorDomElement.SSN),driver);
            String ssnStr=ssn.substring(0,11);
            System.out.println("ssnStr"+ssnStr);
            String tropicalZoaiac=WebDriverApi.getText(elementJson.getString(GeneratorDomElement.TROPICAL_ZODIAC),driver);
            System.out.println("tropicalZoaiac"+tropicalZoaiac);
            String weight=WebDriverApi.getText(elementJson.getString(GeneratorDomElement.WEIGHT),driver);
            String email=WebDriverApi.getText(elementJson.getString(GeneratorDomElement.EMAIL),driver);
            System.out.println("email"+email);
            String password=WebDriverApi.getText(elementJson.getString(GeneratorDomElement.PASSWORD),driver);
            System.out.println("password"+password);
            generatorEntity.setAddress(address);
            generatorEntity.setAge(age);
            generatorEntity.setBirthday(birthDay);
            generatorEntity.setBloodType(bloodType);
            generatorEntity.setCompany(company);
            generatorEntity.setCountryCode(contryCode);
            generatorEntity.setHeight(height);
            generatorEntity.setUserName(name);
            generatorEntity.setOccupation(occupation);
            generatorEntity.setPhone(phone);
            generatorEntity.setSsn(ssnStr);
            generatorEntity.setTropicalZodiac(tropicalZoaiac);
            generatorEntity.setWeight(weight);
            generatorEntity.setGender("1");
            generatorEntity.setEmail(email.substring(0,25));
            generatorEntity.setPassword(password);
            generatorEntity.setUserType("1");//1 账户的基本类型 1：普通 2vip
            generatorEntity.setCountry("US");
            generatorEntity.setStatus("0"); //0 未使用
            driver.close();
            System.out.println(generatorEntity.toString());
            return generatorEntity;
        }catch (Exception e){
            throw new CHException(ErrorConstant.ERROT_10000,ErrorConstant.ERROR_10000_MSG);
        }

    }
/**
    public static void main(String[] args){
        try{
            Timer timer = new Timer();
            CrawlingGeneratorInformation g = new CrawlingGeneratorInformation();
            timer.schedule(new TimerTask() {
                public void run() {
                    try {
                        g.getGeneratorInformation("http://www.fakenamegenerator.com/","x","chrome");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, 2000 , 1000*60*2);
        }catch(Exception e){
           e.printStackTrace();
        }

    }
*/


}
