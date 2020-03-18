package com.automation.tests.day8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestPractice {

    public static void main(String[] args) {
        String expected = "cba";
        String toReverse = "abc";
        String actual = reverseString(toReverse);

        //Assertion
        verifyEquals(expected, actual);

    }

    public static void verifyEquals(String expected, String actual){
        if (expected.equals(actual)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
    }

    public static String reverseString(String str){
        String reversed = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    //annotation
    @Test(description = "Verify if method cna reverse a String")
    public void test(){
        String expected = "elppa";
        String actual = reverseString("apple");
        // comes from TestNG. JUnit also has this class
        // you can compare any data types here
        // to verify if expected result is equal to actual
        Assert.assertEquals(actual,expected);
    }

    @Test(description = "Another test")
    public void test2(){
        String expected = "rac";
        String actual = reverseString("car");
        Assert.assertEquals(actual,expected);
    }


}
