package org.zaza.hackerrank.eulerNgulang;

public class Euler009 {
	
	public static int getPhytagoreanTriplets(int number) {
		int product = -1;
		int limitA = number / 3;
		int limitB = number / 2;
		for (int a = 1; a < limitA; a++) {
			for (int b = a + 1; b < limitB; b++) {
				int c = number - a - b;
				if ((a * a)  + (b * b) == c * c) {
					product = a * b * c;
				}
			}
		}
		return product;
	}

	public static void main(String[] args) {
		System.out.println(getPhytagoreanTriplets(12));
		System.out.println(getPhytagoreanTriplets(24));
		System.out.println(getPhytagoreanTriplets(35));
	}

}
