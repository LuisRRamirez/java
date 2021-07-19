package com.company;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        byte myAge = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        System.out.println(myAge);
        byte age = 30;
        Date now = new Date(); // this is like python where you need to allocate memory, reference types needs memory allocated, doesn't need to be released though
        System.out.println(now);
        Point point1 = new Point(1 ,1 );
        Point point2 = point1; //this guy is talking about pointers basically, they are called reference types
        point1.x = 2;
        System.out.println(point2);
        String message = "c:\Windows\\..";
        message.endsWith("!!");
        System.out.println(message.replace("!", "*"));
        System.out.println(message.trim());
        int[][] numbers = { { 1, 2, 3} ,{4, 5, 6}};
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));
        final float PI = 3.14F;
        double result = (double)10 / (double)3;
        int y = ++x; // ++x is a prefix that actually does something y and x, instead of x++ only doing something to x
         Implicit casting byte > short > int > long > float > double
         explicit casting ex) double = int(x) + 1
        Integer.parseInt(x);// changes string to int
        int result = (int)Math.ceil(1.1F); // ceil returns the number rounded up and floor does the opposite, random gives rando #
            
    }
}
