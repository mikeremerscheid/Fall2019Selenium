package com.automation.warmup;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UnderstandingJavascriptExecutor {
    private static WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
    }

    @AfterMethod
    public void teardown(){
        BrowserUtils.wait(2);
        driver.quit();

    }

    @Test(priority = 0, description = "Send text to serach box on etsy")
    public void test1(){
        //Driver instance created

        driver.get("www.google.com");

    }


}
