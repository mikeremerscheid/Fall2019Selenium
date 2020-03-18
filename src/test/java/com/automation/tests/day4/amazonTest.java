package com.automation.tests.day4;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonTest {

    public static void main(String[] args) throws Exception{
        WebDriver driver = DriverFactory.createDriver(("chrome"));
        driver.get("http://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book", Keys.ENTER);
//        driver.findElement(By.id("gh-btn")).click();
//        WebElement searchResults = driver.findElement(By.tagName("h1"));
//        System.out.println(searchResults.getText().split(" ")[0]);
        String title = driver.getTitle();
        if (title.contains("java book")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
//        String count = driver.findElement(By.class("a-section a-spacing-small a-spacing-top-small")));

        driver.quit();
    }

}
