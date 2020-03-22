package com.automation.warmup;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;


public class tablesPractice {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().version("79").setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        //headless mode makes execution twice faster
        //it does everything except file uploading
        //set it to tru to make it work
        chromeOptions.setHeadless(false);//to run browser without GUI. Makes browser invisible.
        driver = new ChromeDriver(chromeOptions);
        driver.get("http://practice.cybertekschool.com/tables");
        driver.manage().window().maximize();
        BrowserUtils.wait(3);
    }
    @AfterMethod
    public void teardown() {
        BrowserUtils.wait(3);
        driver.quit();
    }

    @Test
    public void test1(){
        WebElement lastNameHeader = driver.findElement(By.xpath("//table[1]//*[text()='Last Name']"));
        lastNameHeader.click();
        BrowserUtils.wait(2);

        List<WebElement> column = driver.findElements(By.xpath("//table[1]//tbody//td[1]"));

        for (int i = 0; i < column.size() - 1; i++){
            String value = column.get(i).getText();
            String nextValue = column.get(i+1).getText();

            Assert.assertTrue(value.compareTo(nextValue)<0);
        }
    }
}
