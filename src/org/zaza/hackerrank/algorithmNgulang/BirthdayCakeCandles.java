package org.zaza.hackerrank.algorithmNgulang;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {
	
    public static int birthdayCakeCandles(List<Integer> candles) {
     	int biggest = 0;
    	for (int i = 0; i < candles.size(); i++) {
    		if (candles.get(i) > biggest) {
    			biggest = candles.get(i);
    		}
    	}

    	int result = 0;
    	for (int j = 0; j < candles.size(); j++) {
    		if (candles.get(j) == biggest) {
    			result++;
    		}
    	}
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(3, 2, 1, 3);
		System.out.println(birthdayCakeCandles(arr));
		birthdayCakeCandles(arr);
	}

}
