package org.zaza.hackerrank.algorithmNgulang;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
	
    public static void plusMinus(List<Integer> arr) {
    	double cNegative = 0;
    	double cZero = 0;
    	double cPositive = 0;
    	for (int i = 0; i < arr.size(); i++) {
    		if (arr.get(i) < 0) {
    			cNegative++;
    		}
    		else if (arr.get(i) == 0) {
    			cZero++;
    		}
    		else {
    			cPositive++;
    		}
    	}
       	System.out.printf("%.6f %n", (cPositive / arr.size()));
       	System.out.printf("%.6f %n", (cNegative / arr.size()));
    	System.out.printf("%.6f %n", (cZero / arr.size()));
     }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> llist = Arrays.asList(-4, 3, -9, 0, 4, 1);
		plusMinus(llist);
	}

}
