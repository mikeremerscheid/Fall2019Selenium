package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) throws Exception {

        // to start Selenium script we need:
        // Setup WebDriver (browser driver) and create webdriver object
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        // In Selenium, everything starts with WebDriver interface
        driver.get("http://google.com"); // to open a website


        Thread.sleep(3000); // for demo, wait 3 seconds
        String title = driver.getTitle(); // returns <title> Some title </title> text
        System.out.println("Title is..." + title);
        String expectedTitle = "Google";



        if (expectedTitle.equals(title)){
            System.out.println("Test passed!");
        }else{
            System.out.println("Test failed!");
        }

//        driver.findElement(By.xpath("(//*[@id="tsf"]/div[2]/div[1]/div[1]/div/div[2]/input"))

        driver.navigate().to("http://amazon.com");
        Thread.sleep(3000); // for demo, wait 3 seconds
        System.out.println("URL: " + driver.getCurrentUrl());
        driver.navigate().refresh(); // to reload page


        if (driver.getTitle().toLowerCase().contains("amazon")) {
            System.out.println("Test passed!");
        }else{
            System.out.println("Test failed!");
        }

        //come back to Google
        driver.navigate().back();


        driver.navigate().to("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(5000);

        //must be at the end
        driver.quit();
        //browser cannot close itself

    }

    public static void verifyEquals(String arg1, String arg2){
        if (arg1.equals(arg2)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
    }
}
