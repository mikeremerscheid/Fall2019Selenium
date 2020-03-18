package com.automation.tests.day4;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorPracticeXPath {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        WebElement headerText = driver.findElement(By.xpath("//span[@class='h1y']"));
        System.out.println(headerText.getText());
        driver.close();
    }



}
