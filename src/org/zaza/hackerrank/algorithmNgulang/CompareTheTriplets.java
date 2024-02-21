package org.zaza.hackerrank.algorithmNgulang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    // Write your code here
    	List<Integer> finalScore = new ArrayList<>();
    	int aliceScore = 0;
    	int bobScore = 0;
    	for (int i = 0; i < a.size(); i++) {
//    			System.out.println(a.get(i) + " === " + b.get(i));
    			if (a.get(i) > b.get(i)) {
    				aliceScore++;
    			}
    			else if (a.get(i) < b.get(i) ) {
    				bobScore++;
    			}
    			
    	}
    	finalScore.add(aliceScore);
    	finalScore.add(bobScore);
//    	System.out.println("Alice's score is " + aliceScore + " and Bob's score is " + bobScore);
    	return finalScore;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> alice = Arrays.asList(17, 6, 30);
		List<Integer> bob = Arrays.asList(99, 6, 8);
//		compareTriplets(alice, bob);
		System.out.println(compareTriplets(alice, bob));
	}

}
