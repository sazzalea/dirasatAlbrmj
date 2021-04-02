package org.zaza.hackerrank.euler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Euler005 {
	
	public static long getSmallestMultiple(int lcm) {
		long smallestMultiple = 0;
		for (long i = lcm; ; i += lcm) {
			boolean found = true;
			for (long j = 2; j <= lcm ; j++) {
				if (i % j != 0) {
					found = false;
					break;
				}
			}
			if (found == true) {
				smallestMultiple = i;
				break;
			}
		}
		return smallestMultiple;
	}
	
	public static boolean isPrime(long number) {
		boolean result = true;
		long sqrt = (long)Math.sqrt(number);
		for (int i = 2; i <= sqrt; i++) {
			if (number % i == 0) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	
	public static long getSmallestMultiple2(int lcm) {
		List<Integer> primes = new ArrayList<>();
		long smallestMultiple = 0;
		for (int i = 2; i <= lcm; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
			else {
				for (int j: primes) {
					int k = 0;
					if (i % j == 0) {
						k = i / j;
//						if (isPrime(k) && !primes.contains(k)) {
						if (isPrime(k)) {
							primes.add(k);
						}
					}
				}
			} 
		}
		for (int l : primes) {
			System.out.println(l);
		} 
		return smallestMultiple;
	}
	
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        for(int a0 = 0; a0 < t; a0++){
//            int n = in.nextInt();
//        }
//    	for (int i = 2; i <= 20; i++)
//    		System.out.println(i + " " +isPrime(i));
    	System.out.println(getSmallestMultiple2(4));
    }

}
