package org.zaza.hackerrank.eulerNgulang;

public class Euler001 {
	
	public static long addMultiple(long number) {
		long total = 0;
		for (int i = 1; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				total += i;
			}
		}
		return total;
	}
	
	public static long addMultiple2(long number) {
		long total = 0;
		long multipleThree = (number - 1) / 3;
		long multipleFive = (number - 1) / 5;
		long multipleFifteen = (number - 1) / 15;
		long totalThree = 3 * ((multipleThree * (multipleThree + 1)) / 2);
		long totalFive = 5 * ((multipleFive * (multipleFive + 1)) / 2);
		long totalFifteen = 15 * ((multipleFifteen * (multipleFifteen + 1)) / 2);
		total = totalThree + totalFive - totalFifteen;
		return total;
	}
	
	public static void main(String[] arg) {
		System.out.println(addMultiple(1000000000L));
		System.out.println(addMultiple2(1000000000L));
	}

}
