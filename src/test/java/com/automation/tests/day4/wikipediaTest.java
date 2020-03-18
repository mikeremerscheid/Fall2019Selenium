package com.automation.tests.day4;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class wikipediaTest {

    public static void main(String[] args) throws Exception{
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.id("searchInput")).sendKeys("Selenium (software)", Keys.ENTER);
       String link = driver.getCurrentUrl();
       if (link.endsWith("Selenium_(software)")){
           System.out.println("Test passed");
       }else{
           System.out.println("Test failed");
       }
        Thread.sleep(1000);
        driver.quit();

    }


}
