package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(2000);

        //By.name("q") --> name = "q"
        WebElement search = driver.findElement(By.name("q"));
        // once we found an element
        // to enter text, use "sendKeys" method
//        search.sendKeys("Java", Keys.ENTER, Keys.);



        //*[@id="tsf"]/div[2]/div[1]/div[1]/div/div[2]/input
        driver.quit();
    }
}
