package com.automation.tests.day4;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ebayTest {

    public static void main(String[] args) throws Exception{
        WebDriver driver = DriverFactory.createDriver(("chrome"));
        driver.get("http://www.ebay.com");
    driver.findElement(By.id("gh-ac")).sendKeys("java book");
    driver.findElement(By.id("gh-btn")).click();
    WebElement searchResults = driver.findElement(By.tagName("h1"));
        System.out.println(searchResults.getText().split(" ")[0]);


        driver.quit();
    }

}
