package com.automation.tests.day3;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementsPractice {

    public static void main(String[] args) throws Exception{
        WebDriver driver = DriverFactory.createDriver(("chrome"));
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("Mister Twister");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("sdet@cybertek.com");

        WebElement signUp = driver.findElement(By.name("wooden_spoon"));
        Thread.sleep(3000);
        signUp.submit();

        String expected = "Thank you for signing up. Click the button below to return to the home page.";


        WebElement message = driver.findElement(By.className("subheader"));


        String actual = message.getText();
        WebElement attribute = driver.findElement(By.className("subheader"));
        System.out.println(actual   );
        System.out.println(attribute);

        Thread.sleep(3000);







    }

}
