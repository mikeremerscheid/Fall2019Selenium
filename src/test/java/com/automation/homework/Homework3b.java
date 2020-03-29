package com.automation.homework;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework3b {
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

    @Test (description = "Test case #6 ")
    public void testCase6(){
        // Go to this website
        driver.get("https://www.tempmailaddress.com/");

        // Define a String variable as the text (getText) of the email field
        String email = driver.findElement(By.xpath("//span[@id='email']")).getText();

        //go to this website
        driver.get("https://practice-cybertekschool.herokuapp.com");

        //find an element and click on it
        driver.findElement(By.xpath("//a[@href='/sign_up']")).click();

        //find an element and sendKeys
        driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys("Howard");

        //find this element, then use sendKeys to type the email address from earlier
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);

        //find element and click on it again
        driver.findElement(By.xpath("//button[@name='wooden_spoon']")).click();

        // go to this address again
        driver.get("https://www.tempmailaddress.com/");

        //Verify (assertEquals)
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"schranka\"]/tr[3]/td[1]/span[2]")).getText(),"do-not-reply@practice.cybertekschool.com");
        System.out.println("Found email.");
        driver.findElement(By.xpath("//*[@id=\"schranka\"]/tr[3]/td[1]/span[2]")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Thanks for subscribing to practice.cybertekschool.com!']")).getText(),"Thanks for subscribing to practice.cybertekschool.com!");
    }

    @Test
    public void testCase7(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//*[text()='File Upload']")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\mkrzr\\Desktop\\testCase7.txt");
        BrowserUtils.wait(2);
        driver.findElement(By.id("file-submit")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//h3")).getText(),"File Uploaded!");
        if (driver.findElement(By.id("uploaded-files")).isDisplayed()){
            Assert.assertEquals(driver.findElement(By.id("uploaded-files")).getText(),"testCase7.txt");
        }
    }

    @Test
    public void testCase8(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//*[text()='Autocomplete']")).click();
        driver.findElement(By.id("myCountry")).sendKeys("United States of America");
        Assert.assertEquals(driver.findElement(By.xpath("//strong")).getText(),"United States of America");
    }

    @Test
    public void testCase9(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//*[text()='Status Codes']")).click();
        driver.findElement(By.xpath("//a[@href='status_codes/200']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'This page returned a 200 status code.')]")).isDisplayed());
    }

    @Test
    public void testCase10(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//*[text()='Status Codes']")).click();
        driver.findElement(By.xpath("//a[@href='status_codes/301']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'This page returned a 301 status code.')]")).isDisplayed());
    }

    @Test
    public void testCase11(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//*[text()='Status Codes']")).click();
        driver.findElement(By.xpath("//a[@href='status_codes/404']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'This page returned a 404 status code.')]")).isDisplayed());
    }

    @Test
    public void testCase12(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//*[text()='Status Codes']")).click();
        driver.findElement(By.xpath("//a[@href='status_codes/500']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'This page returned a 500 status code.')]")).isDisplayed());
    }

}
