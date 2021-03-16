package org.zaza.hackerrank.euler;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Euler002 {
    
    public static long generateFibonacci(long numberMax) {
        long evenFibonacciTotal = 0;
        long number1 = 0;
        long number2 = 1;
        while (number2 + number1 <= numberMax) {
            long temp = number1 + number2;
            number1 = number2;
            number2 = temp;
            if (temp % 2 == 0) {
                evenFibonacciTotal += temp;
            }
        }
        return evenFibonacciTotal;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(generateFibonacci(n));
        }
    }

}
