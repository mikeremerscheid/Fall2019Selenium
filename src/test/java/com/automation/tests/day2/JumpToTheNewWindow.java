package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class JumpToTheNewWindow {

    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/open_new_tab");

        Thread.sleep(5000);
        String windowHandle = driver.getWindowHandle();

        System.out.println(windowHandle);
        System.out.println("BEFORE SWITCH: " + driver.getCurrentUrl());
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        for (String windowId: windowHandles){
            // if it's not an old window, then switch
            if (!windowId.equals(windowHandle)){
                //to jump to the new window
                driver.switchTo().window(windowId);
            }
        }
        Thread.sleep(5000);

        System.out.println("AFTER SWITCH: " + driver.getCurrentUrl());
        driver.quit();

    }

    public static void switchToWindowBasedOnTitle(String pageTitle, WebDriver driver){
        Set<String> windows = driver.getWindowHandles();
        for (String window: windows){

        }
    }

}
