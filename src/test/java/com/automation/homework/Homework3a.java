package com.automation.homework;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework3a {
    private WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = DriverFactory.createDriver("chrome");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test(description = "Test case #1 ")
    public void testCase1() {
        //Step 1. Go to “https://practice-cybertekschool.herokuapp.com"
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        BrowserUtils.wait(1);

        //Step 2. Click on “Registration Form”
        driver.findElement(By.xpath("//*[contains(text(),'Registration')]")).click();
        BrowserUtils.wait(1);

        //Step 3. Enter "wrong_dob" into birthday field
        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("wrong_dob");
        BrowserUtils.wait(1);

        //Step 4.  Verify warning message is displayed:"The date of birth is not valid."
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'The date of birth is not valid')]")).isDisplayed());
        BrowserUtils.wait(1);
    }

    @Test(description = "Test case #2 ")
    public void testCase2() {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        BrowserUtils.wait(1);
        driver.findElement(By.xpath("//*[contains(text(),'Registration')]")).click();
        BrowserUtils.wait(1);
        // xpath format:   //tag[@attribute='value']
        // xpath example:  //input[@name='checkbox']

        //Find all three elements and verify (assertTrue) that they are displayed
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'C++')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Java')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'JavaScript')]")).isDisplayed());
        BrowserUtils.wait(1);
    }

    @Test(description = "Test case #3 ")
    public void testCase3() {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        BrowserUtils.wait(1);
        driver.findElement(By.xpath("//*[contains(text(),'Registration')]")).click();
        BrowserUtils.wait(1);

        //First findElement, then sendKeys (to enter text into that text field)
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("a");

        //Verify (assertTrue) that this element with this specific String of text isDisplayed()
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'first name must be more than 2 and less than 64 characters long')]")).isDisplayed());
        BrowserUtils.wait(3);
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
}
