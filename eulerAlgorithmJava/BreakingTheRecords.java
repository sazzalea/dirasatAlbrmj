package org.zaza.eulerAlgorithmJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {
	
    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    	List<Integer> result = new ArrayList<>();
    	int lowest = scores.get(0);
    	int highest = scores.get(0);
    	int counterLow = 0;
    	int counterHigh = 0;
    	for (int i = 1; i < scores.size(); i++) {
    		int temp = scores.get(i);
    		if (temp < lowest) {
    			lowest = temp;
    			counterLow++;
    		}
    		if (highest < temp) {
    			highest = temp;
    			counterHigh++;
    		}
    	}
//    	System.out.println(counterLow);
//		System.out.println(counterHigh);
		result.add(counterHigh);
		result.add(counterLow);
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> records = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
		System.out.println(breakingRecords(records));
	}

}
