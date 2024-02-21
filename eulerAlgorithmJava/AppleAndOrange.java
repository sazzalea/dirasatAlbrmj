package org.zaza.eulerAlgorithmJava;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {
    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    	int fallenApplesNearTheHouse = 0;
    	for (int i = 0; i < apples.size(); i++) {
    		if (apples.get(i) + a >= s && apples.get(i) + a <= t) {
    			fallenApplesNearTheHouse++;
    		}
    	}
    	System.out.println(fallenApplesNearTheHouse);
    	
    	int fallenOrangesNearTheHouse = 0;
    	for (int j = 0; j < oranges.size(); j++) {
    		if (oranges.get(j) + b <= t && oranges.get(j) + b >= s) {
    			fallenOrangesNearTheHouse++;
    		}
    	}
    	System.out.println(fallenOrangesNearTheHouse);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startingPointOfHouseLocation = 7;
		int endPointOfHouseLocation = 11;
		int locationOfAppleTree = 5;
		int locationOfOrangeTree = 15;
		int fallenApples = 3;
		int fallenOranges = 2;
		List<Integer> fallenAppleDistance = new ArrayList<>();
		fallenAppleDistance.add(-2);
		fallenAppleDistance.add(2);
		fallenAppleDistance.add(1);
		List<Integer> fallenOrangeDistance = new ArrayList<>();
		fallenOrangeDistance.add(5);
		fallenOrangeDistance.add(-6);
		countApplesAndOranges(startingPointOfHouseLocation, endPointOfHouseLocation,locationOfAppleTree, locationOfOrangeTree, fallenAppleDistance, fallenOrangeDistance);
	}

}
