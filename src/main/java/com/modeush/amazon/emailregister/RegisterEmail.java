package com.modeush.amazon.emailregister;


import com.modeush.amazon.base.InitDriver;
import com.modeush.amazon.util.CHException;
import com.modeush.amazon.util.WebDriverApi;
import org.openqa.selenium.WebDriver;

public class RegisterEmail extends InitDriver{

    public static String getCodeNum(String phoneNum,String tokenStr)throws Exception{
        String numCode=SumaApi.getValidateCode(phoneNum,tokenStr);
        System.out.println(numCode);
        if("not_receive".equals(numCode)){
            numCode=getCodeNum(phoneNum,tokenStr);
        }
        return numCode;
    }

    public static String SynGetNum() throws Exception{
        String tokenStr=SumaApi.getRequestToken();
        return getCodeNum(SumaConstant.PROJECT_ID,tokenStr);
    }

    public static void yeshentest() throws CHException,Exception{
        WebDriver driver = init("chrome");
        driver.get("https://cn.overview.mail.yahoo.com/");
        WebDriverApi.waitForLoad(driver);
        WebDriverApi.ExcuClick("/html/body/div[2]/div/div[2]/a",driver);
        WebDriverApi.ExcuClear("//*[@id=\"mb-form\"]/div[1]/input",driver);
        String token=SumaApi.getRequestToken();
        String phoneNum = SumaApi.getPhoneNumber(SumaConstant.PROJECT_ID,token);
        WebDriverApi.ExcuSendKey("//*[@id=\"mb-form\"]/div[1]/input",phoneNum,driver);
        getCodeNum(phoneNum,token);
        Thread.sleep(5000);
        driver.close();

    }

    public static void main(String[] args){
        try{
             String tokenStr=SumaApi.getRequestToken();
             String phoneNum=SumaApi.getPhoneNumber(SumaConstant.PROJECT_ID,tokenStr);
             String s=getCodeNum("13786407447","a2957faf57e0c294af7935524c8b3981");
             System.out.println(s);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
