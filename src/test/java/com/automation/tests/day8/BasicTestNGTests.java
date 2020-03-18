package com.automation.tests.day8;

import org.testng.Assert;
import org.testng.annotations.*;


public class BasicTestNGTests {


    @BeforeClass
    //Runs only once in the class @beforemethod and before test
    public void beforeClass(){
        System.out.println("BEFORE CLASS");
    }


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BEFORE SUITE");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AFTER SUITE");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BEFORE TEST");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AFTER TEST");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AFTER CLASS");
    }

    @BeforeMethod
    public void setup(){
        System.out.println("BEFORE METHOD");
    }

    @AfterMethod
    public void teardown(){
        System.out.println("AFTER METHOD");
    }

    @Test
    public void test1(){
        System.out.println("TEST 1");
        String expected = "apple";
        String actual = "apple";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test2(){
        System.out.println("TEST 2");
        int num1 = 5;
        int num2 = 10;
        Assert.assertTrue(num1>num2);
    }
}

