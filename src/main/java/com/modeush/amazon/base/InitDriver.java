package com.modeush.amazon.base;

import com.modeush.amazon.util.WebDriverInit;
import org.openqa.selenium.WebDriver;

public class InitDriver {
    public static WebDriver init(String browser){
        return WebDriverInit.switchBrowser(browser);
    }
}
