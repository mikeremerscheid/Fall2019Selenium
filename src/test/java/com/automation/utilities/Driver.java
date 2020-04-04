package com.automation.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {
    //same for everyone
    private static WebDriver driver;

    //so no one can create object of Driver class
    //everyone should call static getter method instead
    private Driver() {

    }

    public static WebDriver getDriver() {
        //if webdriver object doesn't exist
        //create it
        if (driver == null) {
            //specify browser type in configuration.properties file
            String browser = ConfigurationReader.getProperty("browser").toLowerCase();
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().version("79").setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "chrome_headless":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions().setHeadless(true);
                    //set capabilities -- DesiredCapabilities --> extensions, proxy, platname
                    return new ChromeDriver();
                case "firefox_headless":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions().setHeadless(true);
                    return new FirefoxDriver();
                default:
                    throw new RuntimeException("Wrong browser name!");
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}
