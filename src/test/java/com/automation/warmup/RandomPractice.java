package com.automation.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPractice {

    public static void main(String[] args) {
        Random dice = new Random();
        int num;
        List<Integer> lst = new ArrayList<>();
        int i = 0;
        do {
            //dice has 6 sides
            num = 1+dice.nextInt(6);
            //optional: only displays the result if it hasn't been shown before, e.g. good for checkboxes on a webpage
            if (!lst.contains(num)){
                System.out.println(num);
                i++;
            }
            lst.add(num);
        }while (i < 6);
        //if you change the 6 to anything higher than the bounds, it'll be an infinite loop
        //because it's looking for values not already added to the List
        //taking the notes away
    }
}
