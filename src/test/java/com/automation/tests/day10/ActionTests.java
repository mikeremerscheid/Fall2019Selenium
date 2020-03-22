package com.automation.tests.day10;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionTests {

    private WebDriver driver;
    private Actions actions;

    @BeforeMethod
    public void setup(){
        driver = DriverFactory.createDriver("chrome");
        actions = new Actions(driver);
    }

//    @Test
//    public void hoverOnImage(){
//        driver.get("http://practice.cybertekschool.com/hovers");
//        driver.manage().window().maximize();
//        BrowserUtils.wait(3);
//
//        WebElement img1 = driver.findElement(By.xpath("(//img)[1]"));
//        WebElement img2 = driver.findElement(By.xpath("(//img)[2]"));
//        WebElement img3 = driver.findElement(By.xpath("(//img)[3]"));
//
//        // Use build when having multiple actions
//        // Always end actions with perform.
//        actions.moveToElement(img1).pause(1000).
//                moveToElement(img2).pause(1000).
//                moveToElement(img3).pause(1000).
//                build().perform();
//
//        // hover on the first image
//        // verify that "name: user1" is displayed
//
//        actions.moveToElement(img1).perform();
//        WebElement imgText1 = driver.findElement(By.xpath("//h5[text()='name: user1']"));
//        Assert.assertTrue(imgText1.isDisplayed());
//        // Verify that web element contains the text is available
//        Assert.assertTrue(imgText1.isDisplayed());
//
//        // move to second image
//        BrowserUtils.wait(2);
//        WebElement imgText2 = driver.findElement(By.xpath("//h5[text()='name: user2']"));
//        Assert.assertTrue(imgText2.isDisplayed());
//    }
//
//    @Test
//    public void  jqueryMenuTest(){
//        driver.get("http://practice.cybertekschool.com/jqueryui/menu#");
//        // hover on "enabled"
//        WebElement enabled = driver.findElement(By.xpath("//a[text()='Enabled']"));
//        actions.moveToElement(enabled).pause(1000).build().perform();
//        // hover on "download"
//        WebElement download = driver.findElement(By.xpath("//a[text()='Downloads']"));
//        actions.moveToElement(download).pause(1000).build().perform();
//        //click on PDF
//        WebElement pdf = driver.findElement(By.xpath("//a[text()='PDF']"));
//        actions.moveToElement(pdf).pause(1000).build().perform();
//        pdf.click();
//    }

    @Test
    public void dragAndDropTest(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement moon = driver.findElement(By.id("draggable"));
        WebElement earth = driver.findElement(By.id("droptarget"));

        actions.dragAndDrop(moon,earth).pause(2).build().perform();

        String expected = "You did great!";
        String actual = earth.getText();
        BrowserUtils.wait(3);

        Assert.assertEquals(actual, expected);

    }


    @AfterMethod
    public void teardown(){
        BrowserUtils.wait(3);
        driver.quit();
    }



}
