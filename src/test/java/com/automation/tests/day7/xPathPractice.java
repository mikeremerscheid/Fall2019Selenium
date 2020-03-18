package com.automation.tests.day7;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.*;

public class xPathPractice {

    public static String userNameLocator = "//label[text()='Username']/following-sibling::input";
    public static String passwordLocator = "//label[text()='Password']/following-sibling::input";
    public static String buttonLocator   = "//button[@type='submit' or @id='wooden_spoon']";


    public static void main(String[] args) throws Exception{

        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        Thread.sleep(3000);
        driver.findElement(By.xpath(userNameLocator)).sendKeys("tomsmith");
        driver.findElement(By.xpath(passwordLocator)).sendKeys("SuperSecretPassword");
        driver.findElement(By.xpath(buttonLocator)).click();

        Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("flash")).getText());
        driver.quit();



    }


}
