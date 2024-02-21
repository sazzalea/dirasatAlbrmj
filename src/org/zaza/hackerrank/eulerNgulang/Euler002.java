package org.zaza.hackerrank.eulerNgulang;

public class Euler002 {
	
	public static long generateFibonacci(long number) {
		long totalEvenFibonacci = 0;
		long number1 = 0;
		long number2 = 1;
		long maxNumber = number;
		while(number1 + number2 <= maxNumber) {
			long temp = number1 + number2;
			number1 = number2;
			number2 = temp;
			if(temp % 2 == 0) {
				totalEvenFibonacci += temp;
			}
		}
		return totalEvenFibonacci;
	}
	
	public static void main(String[] arg) {
		System.out.println(generateFibonacci(100));
	}

}
