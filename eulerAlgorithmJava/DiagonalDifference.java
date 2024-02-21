package org.zaza.eulerAlgorithmJava;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
	
    public static int diagonalDifference(List<List<Integer>> arr) {
    	int absSumValue = 0;
    	int penampung1 = 0;
    	for (int i = 0; i < arr.size(); i++) {
    		penampung1 += arr.get(i).get(i);
    	}
    	int penampung2 = 0;
    	for (int j = arr.size()-1, k = 0; j >= 0; j--, k++) {
    		penampung2 += arr.get(j).get(k);
    	} 
    	absSumValue = Math.abs(penampung1 - penampung2);
    	return absSumValue;
    }
	

	public static void main(String[] args) {
		List<Integer> lst1 = new ArrayList<>();
		List<Integer> lst2 = new ArrayList<>();
		List<Integer> lst3 = new ArrayList<>();
		List<List<Integer>> lstArray2D = new ArrayList<>();
		
		lst1.add(1);
		lst1.add(2);
		lst1.add(3);
		
		lst2.add(4);
		lst2.add(5);
		lst2.add(6);
		
		lst3.add(9);
		lst3.add(8);
		lst3.add(9);
		
		lstArray2D.add(lst1);
		lstArray2D.add(lst2);
		lstArray2D.add(lst3);
		
//		int penampung1 = 0;
//		int penampung2 = 0;
//		for (int i = 0; i < lstArray2D.size(); i++) {
//			penampung1 += lstArray2D.get(i).get(i);
//			System.out.println();
//		}
//		for (int j = lstArray2D.size() - 1, k = 0; j >= 0 && k < lstArray2D.size(); j--,k++) {
//			penampung2 += lstArray2D.get(j).get(k);
//		}
//		System.out.println(penampung1);
//		System.out.println(penampung2);
		
		System.out.println(diagonalDifference(lstArray2D));
	}

}
