package org.zaza.alpro;

public class Bab6Nomor10 {
	
	public static boolean isPrime(int number) {
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
	
	public static void main(String[] args) {
		for (int i = 2; i < 10000; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

}
