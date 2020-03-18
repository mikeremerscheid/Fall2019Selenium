//package com.automation.tests.day8;
//import com.automation.utilities.BrowserUtils;
//import com.automation.utilities.DriverFactory;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import java.util.List;
//public class SearchTests {
//
//    @Test
//    public void googleSearchTest(){
////        driver.get("http://google.com");
////        driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);
//        BrowserUtils.wait(2);
//        //since every search item has a tag name <h3>
//        //it's the easiest way to collect all of them
//        List<WebElement> searchItems = driver.findElements(By.tagName("h3"));
//        for(WebElement searchItem: searchItems){
//            System.out.println(searchItem.getText());
//        }
//    }
//    @BeforeMethod
//    public void setup(){
//        //setup WebDriver
//        WebDriverManager.chromedriver().version("79").setup();
//        driver = new ChromeDriver();
//    }
//    @AfterMethod
//    public void teardown(){
//        //close browser and destroy WebDriver object
//        driver.quit();
//    }
//
//    @Test(description = "Search for Java book on Amazon")
//    public void amazonSearchTest(){
////        DriverFactory.createADriver("chrome");
//        driver.get("https://amazon.com");
//        BrowserUtils.wait(1);
//
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java", Keys.ENTER);
//        BrowserUtils.wait(1);
//
////        List<WebElement> searchItems = driver.findElements(By.tagName("h2"));
////        List<WebElement> searchItems = driver.findElements(By.xpath("//h2//a"));
//
//        //click on teh first item
//        for(WebElement searchItem: searchItems){
//            System.out.println("Title: " + searchItem.getText());
//        }
//
//        searchItems.get(0).click();
//        BrowserUtils.wait(1);
//
////        WebElement productTitle = driver.findElement(By.id("title"));
//        String productTitleString = productTitle.getText();
//        System.out.println(productTitleString);
//
//        Assert.assertTrue(productTitleString.contains("Java"));
//
////        JavascriptExecutor jse = (JavascriptExecutor)driver;
//
//        jse.executeScript("scroll(0, 500);");
//        BrowserUtils.wait(5);
//
//    }
//
//}