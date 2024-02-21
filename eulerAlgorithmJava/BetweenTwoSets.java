package org.zaza.eulerAlgorithmJava;

import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {
	
	public static int findGcd(int numA, int numB) { 
		int gcd = 1;
//		int smallestNum = numA < numB ? numA : numB;
		int smallestNum = Math.min(numA, numB);
		for (int i = 1; i <= smallestNum; i++) {
			if (numA % i == 0 && numB % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	public static int findGcd(List<Integer> arr) {
		int gcd = arr.get(0);
		for (int i = 1; i < arr.size(); i++) {
			gcd = findGcd(gcd, arr.get(i));
//			System.out.println(arr.get(i - 1) + ", " + arr.get(i) + ": " + gcd);
		}
		return gcd;
	}
	
	public static int findLcm(int numA, int numB) {
		return (numA * numB) / findGcd(numA, numB);
	}
	
	public static int findLcm(List<Integer> arr) {
		int lcm = arr.get(0);
		for (int i = 1; i < arr.size(); i++) {
			lcm = findLcm(lcm, arr.get(i));
		}
		return lcm;
	}
	
    public static int getTotalX(List<Integer> a, List<Integer> b) {
    	int count = 0;
    	int lcmA = findLcm(a);
//    	System.out.println("lcmA " + lcmA);
    	int gcdB = findGcd(b);
//    	System.out.println("gcdB " + gcdB);
    	for (int i = lcmA; i <= gcdB; i++) {
    		if (gcdB % i == 0 && i % lcmA == 0) {
//    			System.out.println(i + ", " + gcdB);
    		   	count++;
    		}
    	}
     	return count;
    }

	public static void main(String[] args) {
		List<Integer> listA = Arrays.asList(2, 3, 6);
		List<Integer> listB = Arrays.asList(42, 84);
//		System.out.println(findGcd(2, 4));
//		System.out.println(findGcd(24, 35));
//		System.out.println(findGcd(listA));
//		System.out.println(findGcd(listB));
//		System.out.println(findLcm(24, 36));
//		System.out.println(findLcm(listA));
//		System.out.println(findLcm(listB));
		System.out.println(getTotalX(listA, listB));
	}

}
