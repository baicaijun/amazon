package com.modeush.amazon.util;

import java.util.Set;

import org.apache.http.HttpException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author chenyixiao
 *  webdriver api 的封装，方便反射调用
 *  支持最多两个参数的形式
 */
public class WebDriverApi  {


    //一个参数的列表：

    //打开网址
    public static void getUrl(String Url,WebDriver driver) throws HttpException, CHException{


        driver.get(Url);

    }
    public static WebElement getEelement(String path,WebDriver driver) throws NoSuchElementException, CHException{

        try{
            WebElement element = null;
            element = driver.findElement(By.xpath(path));
            return element;
        }catch(NoSuchElementException e){
            throw new CHException("未找到元素");
        }
    }
    public static void ExcuSendKey(String path,String param,WebDriver driver) throws CHException{
        try{
            getEelement(path, driver).sendKeys(param);

        }catch(NoSuchElementException e){
            throw new CHException("执行输入失败");
        }
    }



    //执行点击操作
    public static void ExcuClick(String path,WebDriver driver) throws CHException{
        getEelement(path,driver).click();
    }
    //执行clear操作
    public static void ExcuClear(String path,WebDriver driver) throws CHException{
        getEelement(path,driver).clear();
    }

    //执行js
    public static void ExcuJS(String js,WebDriver driver){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript(js);
    }
    //切换浏览器的标签页
    public static String switchToWindow(String windowTitle,WebDriver driver){
        String flag = "false";
        try {
            String currentHandle = driver.getWindowHandle();
            Set<String> handles = driver.getWindowHandles();
            for (String s : handles) {
                if (s.equals(currentHandle))
                    continue;
                else {
                    driver.switchTo().window(s);
                    if (driver.getTitle().contains(windowTitle)) {
                        flag = "cxy";
                        System.out.println("Switch to window: "
                                + windowTitle + " successfully!");
                        break;
                    } else
                        continue;
                }
            }
        } catch (Exception e) {
            System.out.printf("Window: " + windowTitle
                    + " cound not found!", e.fillInStackTrace());
            flag = "false";
        }
        return flag;
    }
    //切换frame
    public static  String switchFrame(String path,WebDriver driver) throws CHException{

        try{
            driver.switchTo().frame(getEelement(path,driver));
            return "cxy";
        }catch(Exception e){
            throw new CHException("Frame未找到");
        }
    }
    //alert()弹窗处理
    public static String ExcuAlert(WebDriver driver) throws CHException{
        try{
            driver.switchTo().alert().accept();
            return "cxy";
        }catch(Exception e){
            throw new CHException("处理alert弹窗失败");
        }
    }
    //浏览器放大
    public static String ExcuMaxWindow(WebDriver driver) throws CHException{
        try{
            driver.manage().window().maximize();
            return "cxy";
        }catch(Exception e){
            throw new CHException("浏览器操作失败");
        }
    }
    //浏览器刷新
    public static String ExcuFresh(WebDriver driver) throws CHException{
        try{
            driver.navigate().refresh();
            return "cxy";
        }catch(Exception e){

            throw new CHException("浏览器操作失败");
        }
    }
    //浏览器回退
    public static String excuBack(WebDriver driver) throws CHException{
        try{
            driver.navigate().back();
            return "cxy";
        }catch(Exception e){
            throw new CHException("浏览器回退操作执行失败");
        }
    }
    //浏览器前跳
    public static String excuForward(WebDriver driver) throws CHException{
        try{
            driver.navigate().forward();
            return "cxy";
        }catch(Exception e){

            throw new CHException("浏览器回退操作执行失败");
        }
    }

    public static String closeChrome(WebDriver driver) throws CHException{
        try{
            driver.quit();
            return  "cxy";
        }catch(Exception e){
            throw new CHException("退出浏览器失败");
        }
    }
    public static String sleepThread(String time) throws CHException{
        try{
            int Ttime=Integer.parseInt(time);
            Thread.sleep(Ttime);
            return "cxy";
        }catch(Exception e){
            throw new CHException("执行等待失败");
        }
    }
    public static String sleepThread01(String time) throws CHException{
        try{
            int Ttime=Integer.parseInt(time);
            Thread.sleep(Ttime);
            return "cxy";
        }catch(Exception e){
            throw new CHException("执行等待失败");
        }
    }
    public static String sleepThread02(String time) throws CHException{
        try{
            int Ttime=Integer.parseInt(time);
            Thread.sleep(Ttime);
            return "cxy";
        }catch(Exception e){
            throw new CHException("执行等待失败");
        }
    }
    public static String sleepThread03(String time) throws CHException{
        try{
            int Ttime=Integer.parseInt(time);
            Thread.sleep(Ttime);
            return "cxy";
        }catch(Exception e){
            throw new CHException("执行等待失败");
        }
    }
    public static String sleepThread04(String time) throws CHException{
        try{
            int Ttime=Integer.parseInt(time);
            Thread.sleep(Ttime);
            return "cxy";
        }catch(Exception e){
            throw new CHException("执行等待失败");
        }
    }
    public static String sleepThread05(String time) throws CHException{
        try{
            int Ttime=Integer.parseInt(time);
            Thread.sleep(Ttime);
            return "cxy";
        }catch(Exception e){
            throw new CHException("执行等待失败");
        }
    }
    public static String sleepThread07(String time) throws CHException{
        try{
            int Ttime=Integer.parseInt(time);
            Thread.sleep(Ttime);
            return "cxy";
        }catch(Exception e){
            throw new CHException("执行等待失败");
        }
    }
    public static String sleepThread08(String time) throws CHException{
        try{
            int Ttime=Integer.parseInt(time);
            Thread.sleep(Ttime);
            return "cxy";
        }catch(Exception e){
            throw new CHException("执行等待失败");
        }
    }
    public static String sleepThread09(String time) throws CHException{
        try{
            int Ttime=Integer.parseInt(time);
            Thread.sleep(Ttime);
            return "cxy";
        }catch(Exception e){
            throw new CHException("执行等待失败");
        }
    }
    public static String sleepThread10(String time) throws CHException{
        try{
            int Ttime=Integer.parseInt(time);
            Thread.sleep(Ttime);
            return "cxy";
        }catch(Exception e){
            throw new CHException("执行等待失败");
        }
    }
    //获取页面标题
    public static String getTitle(WebDriver driver) throws CHException{
        try{
            String title =driver.getTitle();
            return title;
        }catch(Exception e){
            throw new CHException("获取标题失败");
        }
    }
    //获取某个Url
    public static String getCurrentUrl(WebDriver driver) throws CHException{
        try{
            String title =driver.getCurrentUrl();
            return title;
        }catch(Exception e){
            throw new CHException("获取当前Url失败");
        }
    }
    //获取某个元素的text
    public static String getText(String path,WebDriver driver) throws CHException{
        try{
            String text=getEelement(path,driver).getText();
            return text;
        }catch(Exception e){
            throw new CHException("获取text失败");
        }
    }
    //获取某个标签的属性
    public static String getAttribute(String path,String Attribute,WebDriver driver) throws CHException{
        try{
            String text=getEelement(path,driver).getAttribute(Attribute);
            return text;
        }catch(Exception e){
            throw new CHException("获取属性信息失败");
        }
    }
    //equals
    public static String DBTVALUE(String Pone,String Ptwo,WebDriver driver) {
        if(Pone.equals(Ptwo)){
            return "DUI";
        }return "CUO";

    }
    //contins
    public static String DBCVALUE(String Pone,String Ptwo,WebDriver driver) {
        if(Pone.contains(Ptwo)){
            return "DUI";
        } return "CUO";

    }

    //判断页面是否完全加载

   public static void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoad= new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoad);
    }

    public static void main(String args[]) throws HttpException, CHException{


    }


}