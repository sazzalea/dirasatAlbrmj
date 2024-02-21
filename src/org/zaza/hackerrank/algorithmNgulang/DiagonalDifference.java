package org.zaza.hackerrank.algorithmNgulang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

//    public static int diagonalDifference(List<List<Integer>> arr) {
//    	int absResult = 0;
//    	int diagonal1 = 0;
//    	int diagonal2 = 0;
//    	for (int i = 0; i < arr.size(); i++) {
//    		for (int j = 0; j < arr.get(i).size(); j++) {
//    			if (i == j) {
//    				diagonal1 += arr.get(i).get(j);
//    			}
//    		}
//    	}
//    	
//    	for (int i = 0; i < arr.size(); i++) {
//    		for (int j = arr.get(i).size()-1; j >= 0 ; j--) {
//    			if (i + j == arr.size()-1) {
//    				diagonal2 += arr.get(i).get(j);
//    				
//    			}
//    		}
//    	}
////    	System.out.println(diagonal1);
////    	System.out.println(diagonal2);
//    	absResult = Math.abs(diagonal1-diagonal2);
//    	return absResult;
//    }

  public static int diagonalDifference2(List<List<Integer>> arr) {
	  int absResult = 0;
	  
	  int penampung1 = 0;
	  for (int i = 0; i < arr.size(); i++) {
		  penampung1 += arr.get(i).get(i);
	  }
	  
	  int penampung2 = 0;
		for (int i = 0, j = arr.size() - 1; i < arr.size() && j >= 0; i++, j--) {
			penampung2 += arr.get(i).get(j);
		}
		
//		System.out.println(penampung1);
//		System.out.println(penampung2);
		absResult = Math.abs(penampung1 - penampung2);
	  return absResult;
  }

	public static void main(String[] args) {
		List<List<Integer>> arrMat = new ArrayList<>();
		List<Integer> arr1 = Arrays.asList(11, 2, 4, 9, 1);
		List<Integer> arr2 = Arrays.asList(4, 5, 6, 7, 8);
		List<Integer> arr3 = Arrays.asList(10, 8, -12, 2, 4);
		List<Integer> arr4 = Arrays.asList(10, 8, -12, 3, 1);
		List<Integer> arr5 = Arrays.asList(1, 8, -12, 3, 1);
		arrMat.add(arr1);
		arrMat.add(arr2);
		arrMat.add(arr3);
		arrMat.add(arr4);
		arrMat.add(arr5);
//		diagonalDifference2(arrMat);
		System.out.println(diagonalDifference2(arrMat));

	}

}
