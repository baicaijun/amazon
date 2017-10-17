package com.modeush.amazon.util;

import com.modeush.amazon.config.Constant;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverInit {
    /**
     * 获取浏览器driver
     * @param BrowserName 初始化浏览器的名称
     * @return
     */
    public static WebDriver switchBrowser(String BrowserName){
        WebDriver driver = null;
        if(BrowserName!=null&&Constant.CHROME_BROWSER_NAME.equals(BrowserName)){
            driver = new ChromeDriver();
        }else if(BrowserName!=null&&Constant.FIREFOX_BROWSER_NAME.equals(BrowserName)){
            driver = new FirefoxDriver();
        }else if(BrowserName!=null&&Constant.IE_BROWSER_NAME.equals(BrowserName)){
            driver = new InternetExplorerDriver();
        }else{
            driver = new ChromeDriver(); //默认chrome浏览器
        }
        return  driver;
    }
}
