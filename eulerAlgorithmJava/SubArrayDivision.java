package org.zaza.eulerAlgorithmJava;
import java.util.Arrays;
import java.util.List;

public class SubArrayDivision {
	
    public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
    	int ways = 0;
    	for (int i = 0; i < s.size() - (m - 1); i++) {
    		int sum = 0;
    		for (int j = i; j < i + m; j++) {
    			sum += s.get(j);
//    			System.out.print(s.get(j) + " ");
    		}
			if (sum == d) {
				ways++;
			}
//    		System.out.println("   total " + sum);
    	}
    	return ways;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> chocolateBar = Arrays.asList(1, 2, 1, 3, 2);
//		List<Integer> chocolateBar = Arrays.asList(1, 1, 1, 1, 1, 1);
		List<Integer> chocolateBar = Arrays.asList(4);
//		int day = 3;
		int day = 4;
//		int month = 2;
		int month = 1;
		System.out.println(birthday(chocolateBar, day, month));
	}

}
