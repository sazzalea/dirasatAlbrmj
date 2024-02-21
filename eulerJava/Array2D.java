package org.zaza.eulerJava;

import java.util.ArrayList;
import java.util.List;

public class Array2D {
	
	
	public static int hourGlass(List<List<Integer>> ar) {
		int largestSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < ar.size()-2; i++) {
			for (int j = 0; j < ar.size()-2; j++) {
				sum = ar.get(i).get(j) + ar.get(i).get(j+1) + ar.get(i).get(j+2) 
									+ ar.get(i+1).get(j+1)
						+ ar.get(i+2).get(j) + ar.get(i+2).get(j+1) + ar.get(i+2).get(j+2);
				if (sum > largestSum) {
					largestSum = sum;
				}
			}
		}
	
		return largestSum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst1 = new ArrayList<>();
		List<Integer> lst2 = new ArrayList<>();
		List<Integer> lst3 = new ArrayList<>();
		List<Integer> lst4 = new ArrayList<>();
		List<Integer> lst5 = new ArrayList<>();
		List<Integer> lst6 = new ArrayList<>();
		List<List<Integer>> arr = new ArrayList<>();
		
		lst1.add(-1);
		lst1.add(-1);
		lst1.add(0);
		lst1.add(-9);
		lst1.add(-2);
		lst1.add(-2);
		
		lst2.add(-2);
		lst2.add(-1);
		lst2.add(-6);
		lst2.add(-8);
		lst2.add(-2);
		lst2.add(-5);
		
		lst3.add(-1);
		lst3.add(-1);
		lst3.add(-1);
		lst3.add(-2);
		lst3.add(-3);
		lst3.add(-4);
		
		lst4.add(-1);
		lst4.add(-9);
		lst4.add(-2);
		lst4.add(-4);
		lst4.add(-4);
		lst4.add(-5);
		
		lst5.add(-7);
		lst5.add(-3);
		lst5.add(-3);
		lst5.add(-2);
		lst5.add(-9);
		lst5.add(-9);
		
		lst6.add(-1);
		lst6.add(-3);
		lst6.add(-1);
		lst6.add(-2);
		lst6.add(-4);
		lst6.add(-5);
		
		arr.add(lst1);
		arr.add(lst2);
		arr.add(lst3);
		arr.add(lst4);
		arr.add(lst5);
		arr.add(lst6);
		
		System.out.println(hourGlass(arr));
	}

}
