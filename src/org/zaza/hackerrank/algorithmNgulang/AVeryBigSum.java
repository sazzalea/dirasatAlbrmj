package org.zaza.hackerrank.algorithmNgulang;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class AVeryBigSum {
	
    public static long aVeryBigSum(List<Long> ar) {
    	long result = 0;
    	for (int i = 0; i < ar.size(); i++) {
    		result += ar.get(i);
    	}
    	return result;
    }


	public static void main(String[] args) {
		List<Long> arr = new ArrayList<>();
		arr.add(1000000001L);
		arr.add(1000000002L);
		arr.add(1000000003L);
		arr.add(1000000004L);
		arr.add(1000000005L);
		System.out.println(aVeryBigSum(arr));
	}

}
