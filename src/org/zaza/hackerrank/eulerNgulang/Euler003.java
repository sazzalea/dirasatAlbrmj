package org.zaza.hackerrank.eulerNgulang;

public class Euler003 {

	public static long getLargestPrime(long number) {
		long largestPrime = 0;
		while(number % 2 == 0) {
			number /= 2;
		}
		long i = 3;
		while (i * i <= number) {
			if (number % i == 0) {
				number /= i;
			}
			else {
				i += 2;
			}
		}
		largestPrime = (number == 1) ? 2 : number;
		return largestPrime;
	}
	
	public static void main(String[] args) {
		System.out.println(getLargestPrime(340));
	}

}
