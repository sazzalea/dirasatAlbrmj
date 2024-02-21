package org.zaza.hackerrank.eulerNgulang;

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
					if (temp > result && temp < number) {
						result = temp;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] arg) {
		System.out.println(getLargestPalindrome(800000));
	}
}
