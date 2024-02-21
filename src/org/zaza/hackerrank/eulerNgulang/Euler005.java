package org.zaza.hackerrank.eulerNgulang;

public class Euler005 {
	
	public static long getSmallestMultiple(int lcm) {
		long smallestMultiple = 0;
		for (long i = lcm; ; i += lcm) {
			boolean found = true;
			for (long j = 2; j <= lcm; j++) {
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

	public static void main(String[] args) {
		System.out.println(getSmallestMultiple(3));
		System.out.println(getSmallestMultiple(10));
	}

}
