package com.automation.homework;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class Homework4 {

    private WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = DriverFactory.createDriver("chrome");
        BrowserUtils.wait(2);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void days(){
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));


        int count = 0;
        Random r = new Random();
        int low = 0;
        int high = checkboxes.size()-1;
        int result = r.nextInt(high-low)+low;

        do {
            System.out.println(checkboxes.get(result));
            count++;
        }while(count<3);
    }

}
