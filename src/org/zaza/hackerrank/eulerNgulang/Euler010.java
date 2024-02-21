package org.zaza.hackerrank.eulerNgulang;

import java.util.ArrayList;
import java.util.List;

public class Euler010 {
	
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
		final long max = 1000000;
		listPrime.add(2L);
		for (long i = 3; i <= max; i += 2) {
			if (isPrime(i)) {
				listPrime.add(i);
			}
		}
	}
	
	public static long summationPrime(int number) {
		long result = 0;
		int angka = 0;
		while (listPrime.get(angka) <= number) {
			result += listPrime.get(angka);
			angka++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		generatePrime();
		System.out.println(summationPrime(5));
		System.out.println(summationPrime(10));
	}

}
