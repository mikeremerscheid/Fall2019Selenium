package com.automation.warmup;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class tablePractice3 {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = DriverFactory.createDriver("chrome");
//        driver.get("http://practice.cybertekschool.com/dynamic_loading/2");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

//    @Test
//    public void tableTest(){
//        driver.get("http://practice.cybertekschool.com/tables");
//        WebElement value = driver.findElement(By.xpath("//table[1]//tr[2]//td[3]"));
//        String actual = value.getText();
//        String expected = "fbach@yahoo.com";
//        Assert.assertEquals(actual, expected);
//        System.out.println("Expected: " + expected);
//        System.out.println("Actual: " + actual);
//    }

//    @Test
//    public void tableTest2(){
//        driver.get("http://practice.cybertekschool.com/tables");
//        List<WebElement> values = driver.findElements(By.xpath("//table[1]//td[last()]"));
//        System.out.println(driver.findElement(By.xpath("//table[1]//th[last()]")).getText());
//        for (WebElement value:values){
//            System.out.println(value.getText());
//        }
//    }

//    @Test
//    public void tableTest4(){
//        driver.get("http://practice.cybertekschool.com/tables");
//        System.out.println(driver.findElement(By.xpath("//table[1]//tbody//tr[3]//td[1]")).getText());
//    }

}
