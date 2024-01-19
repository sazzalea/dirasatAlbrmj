package org.zaza.hackerrank.eulerNgulang;

import java.util.ArrayList;
import java.util.List;

public class Euler007 {

	public static boolean isPrime(long number) {
		boolean result = true;
		int sqrt = (int)Math.sqrt(number);
		for (int i = 2; i <= sqrt; i++) {
			if (number % i == 0) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	private static List<Long> listPrime = new ArrayList<>();
	
	public static void generatePrime() {
		final long limit = 10000;
		listPrime.add(2L);
		for (long i = 3; listPrime.size() <= limit; i += 2) {
			if (isPrime(i)) {
				listPrime.add(i);
			}
		}
	}
	
	public static long nthPrime(int number) {
		return listPrime.get(number-1);
	}
	
	public static void main(String[] args) {
		generatePrime();
		System.out.println(nthPrime(3));
		System.out.println(nthPrime(6));
	}

}
