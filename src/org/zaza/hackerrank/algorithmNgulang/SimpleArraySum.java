package org.zaza.hackerrank.algorithmNgulang;

import java.util.Arrays;
import java.util.List;

public class SimpleArraySum {
	
	public static int sumArray(List<Integer> arr) {
		int totalSum = 0;
		for (int i = 0; i < arr.size(); i++) {
//			System.out.println(arr.get(i));
			totalSum += arr.get(i);
		}
		return totalSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arraySum = Arrays.asList(1, 2, 3, 4, 10, 11);
//		sumArray(arraySum);
		System.out.println(sumArray(arraySum));
	}

}
