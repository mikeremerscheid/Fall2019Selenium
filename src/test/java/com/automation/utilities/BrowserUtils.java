package com.automation.utilities;

public class BrowserUtils {
    public static void wait (int seconds){
        try {
            Thread.sleep(2000*seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}