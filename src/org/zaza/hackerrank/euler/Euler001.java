package org.zaza.hackerrank.euler;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Euler001 {
    
    public static long addMultiple(int number) {
        long total = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }
        return total;
    }
    
    public static long addMultiple2(int number) {
        long total = 0;
//        3 + 6 + 9 + 12 + 15 + 18 = 3 (1 + 2 + 3 + 4 + 5 + 6) = 3 (6 *(6 + 1) / 2)
        long multipleThree = (number-1) / 3;
        long multipleFive = (number-1) / 5;
        long multipleFifteen = (number-1) / 15;
        long total3 = 3 * (multipleThree *(multipleThree + 1) / 2);
        long total5 = 5 * (multipleFive *(multipleFive + 1) / 2);
        long total15 = 15 * (multipleFifteen *(multipleFifteen + 1) / 2);
        total = total3 + total5 - total15;
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            System.out.println(addMultiple2(n));
        }
    }
}