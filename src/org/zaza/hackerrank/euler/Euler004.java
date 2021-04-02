package org.zaza.hackerrank.euler;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Euler004 {
	
	public static boolean isPalindrome(int number) {
		int rev = 0;
		for (int i = number; i != 0; i = i / 10) {
			int remainder = i % 10;
			rev = (rev * 10) + remainder;
		}
		return rev == number;
	}
	
	public static int getLargestPalindrome(int number) {
		int result = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int temp = i * j;
				if (isPalindrome(temp)) {
//					if (temp > number) 
//						return result;
					if (temp > result && temp < number) 
//					if (temp > result) 
						result = temp;
//					System.out.println(i + " * " + j + " = " + result + " (palindrom)");
				}
//				else System.out.println(i + " * " + j + " = " + temp);
			}
		}
		return result;
	}
	
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
    	System.out.println(getLargestPalindrome(n));
        }
    }
}
