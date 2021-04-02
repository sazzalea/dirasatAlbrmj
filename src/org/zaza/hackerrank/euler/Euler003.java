package org.zaza.hackerrank.euler;

import java.util.ArrayList;
import java.util.Scanner;

public class Euler003 {

	private static ArrayList<Long> arrLong = new ArrayList<>();

	
	public static boolean isPrime(long number) {
		boolean result = true;
		long sqrt = (long)Math.sqrt(number);
		for (int i = 0; i < arrLong.size(); i++) {
			if (arrLong.get(i) > sqrt) {
				break;
			}
			System.out.println("\t\t\t testing " + number + " modulus " + arrLong.get(i));
			if (number % arrLong.get(i) == 0) {
				result = false;
				break;
			}
		}
		return result;
	}
	
//	public static long getLargestPrime(long number) {
//		long largestPrime = 0;
//		for (long i = 2; i <= number; i++) {
//			System.out.println("testing: " + i);
//			if (number % i == 0) {
//				System.out.println("\t " + i + " adalah faktor");
//				if (isPrime(i)) {
//					arrLong.add(i);
//					do {
//						number /= i;
//					} while(number % i == 0);
//					largestPrime = i;
//					System.out.println("\t\t" + i + " adalah bilangan prima, sekarang maxTestnya: " + number);
//				}
//			}
//		}
//		return largestPrime;
//	}
	
	public static long getLargestPrime(long number) {
		long largestPrime = 2;
		while (number % 2 == 0) {
			number /= 2;
		}
//		long i;
//		for (i = 3; i <= number; i += 2 ) {
//			System.out.println("testing: " + i);
//			while (number % i == 0) {
//				System.out.println("\t " + i + " adalah faktor");
//				number /= i;
//				System.out.println("\t\t" + i + " adalah bilangan prima, sekarang maxTestnya: " + number);
//			}
//			if (number == 1) {
//				break;
//			}
//		}
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
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(getLargestPrime(n));
        }
    }

}
