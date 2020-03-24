package com.automation.homework;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework20200324 {
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

    @Test(description = "Test case #1 ")
    public void testCase1() {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        BrowserUtils.wait(1);
        driver.findElement(By.xpath("//*[contains(text(),'Registration')]")).click();
        BrowserUtils.wait(1);
        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/input")).sendKeys("wrong_dob");
        BrowserUtils.wait(1);
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'The date of birth is not valid')]")).isDisplayed());
        BrowserUtils.wait(1);
    }

    @Test(description = "Test case #2 ")
    public void testCase2() {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        BrowserUtils.wait(1);
        driver.findElement(By.xpath("//*[contains(text(),'Registration')]")).click();
        BrowserUtils.wait(1);
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/form/div[11]/div/div[1]/label")).getText(), "C++");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/form/div[11]/div/div[2]/label")).getText(), "Java");
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/form/div[11]/div/div[3]/label")).getText(), "JavaScript");
        BrowserUtils.wait(1);
    }

    @Test(description = "Test case #3 ")
    public void testCase3() {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        BrowserUtils.wait(1);
        driver.findElement(By.xpath("//*[contains(text(),'Registration')]")).click();
        BrowserUtils.wait(1);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/form/div[1]/div/input")).sendKeys("x");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'first name must be more than 2 and less than 64 characters long')]")).isDisplayed());
        BrowserUtils.wait(1);
    }

    @Test(description = "Test case #4 ")
    public void testCase4() {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        BrowserUtils.wait(1);
        driver.findElement(By.xpath("//*[contains(text(),'Registration')]")).click();
        BrowserUtils.wait(1);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/form/div[2]/div/input")).sendKeys("x");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'The last name must be more than 2 and less than 64 characters long')]")).isDisplayed());
        BrowserUtils.wait(1);
    }

    @Test(description = "Test case #5")
    public void testcase5() {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//*[contains(text(),'Registration')]")).click();
        driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Howard");
        driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Duck");
        driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("123456");
        driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("email@emailemail.com");
        driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("12345678");
        driver.findElement(By.xpath("//input[contains(@name,'phone')]")).sendKeys("321-000-4444");
        driver.findElement(By.xpath("//input[@type='radio'][@value='male']")).click();
        driver.findElement(By.xpath("//input[contains(@name,'birthday')]")).sendKeys("11/11/1111");
        driver.findElement(By.xpath("//select[contains(@name,'department')]")).click();
        driver.findElement(By.xpath("//option[@value='DA']")).click();
        driver.findElement(By.xpath("//select[@name='job_title']")).click();
        driver.findElement(By.xpath("//option[.='Designer']")).click();
        driver.findElement(By.xpath("//input[@value='java']")).click();
        driver.findElement(By.xpath("//button[@id='wooden_spoon']")).click();
        //Search for specific text at the end of a few levels and verify it's displayed
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/p[contains(text(),\"You've successfully completed registration!\")]")).isDisplayed());
    }

    @Test(description = "Test case #6 ")
    public void testCase6() {

    }

}
