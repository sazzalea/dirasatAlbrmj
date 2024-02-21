package org.zaza.eulerAlgorithmJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisbleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    	int divisiblePairs = 0;
    	for (int i = 0; i < ar.size(); i++) {
    		int bil1 = ar.get(i);
    		for (int j = i + 1; j < ar.size(); j++) {
//    			if (i < j) {
	    			int bil2 = ar.get(j);
	    			System.out.println(bil1 + " berpasangan dengan " + bil2);
	    			int sum = bil1 + bil2;
	    			if (sum % k == 0) {
	    				divisiblePairs++;
//	    			}
    			}
    		}
    		System.out.println("====================");
    	}
    	return divisiblePairs;
    }

	
	public static void main(String[] args) {
		int memberInArray = 6;
		int divisor = 5;
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(divisibleSumPairs(memberInArray, divisor, arr));
	}

}
