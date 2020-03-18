package com.automation.tests.vytrack.login;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// STATIC IMPORT OF ALL ASSERTIONS
import static org.testng.Assert.*;

public class LoginPageTest {

    private WebDriver driver;
    private String URL = "https://qa2.vytrack.com/user/login";
    // CREDENTIALS FOR store manager
    private String username = "storemanager85";
    private String password = "UserUser123";
    private By usernameBy = By.id("prependedInput");
    private By passwordBy = By.id("prependedInput2");
    // > in cssSelector means same thing as / in xpath - direct child
    private By warningMessageBy = By.cssSelector("[class='alert alert-error'] > div");


    @Test(description = "Login as store manager ")
    public void loginAsStoreManager(){
        driver.findElement(usernameBy).sendKeys("storemanager85");
        driver.findElement(passwordBy).sendKeys("UserUser123", Keys.ENTER);
        BrowserUtils.wait(5);

        String expected = "Dashboard";
        String actual = driver.getTitle();

        assertEquals(actual, expected,"Page title is not correct!");
    }


//    @Test(description = "Verify that the warning message display twhen user enters invalid username")
//    public void invalidUsername(){
//        driver.findElement(usernameBy).sendKeys("invalidusername");
//        driver.findElement(passwordBy).sendKeys("UserUser123", Keys.ENTER);
//        BrowserUtils.wait(3);
//        WebElement warningElement = driver.findElement(warningMessageBy);
//        assertTrue(warningElement.isDisplayed());
////        assertEquals(actual, expected);
//    }

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().version("79").setup();
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        // if webdriver object exists
        if (driver != null){
            // close browser, close session
            driver.quit();
            // destroy driver object for sure
            driver = null;
        }
    }


}
