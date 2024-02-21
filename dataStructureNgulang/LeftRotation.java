package org.zaza.dataStructureNgulang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {
	
//    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
//    	for (int i = 1; i <= d; i++) {
//    		int temp = arr.get(0);
//    		for (int j = 0; j < arr.size() - 1; j++) {
////    			System.out.println(temp);
//    			arr.set(j, arr.get(j + 1));
////    			arr.set(arr.size()-1, 0);
//    			System.out.println(arr.get(j) + " di index ke " + j);
////    			System.out.println(arr.get(4));
//    		}
//    		System.out.println("===========");
//    	}
//    	return arr;
//    }
//	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
//		for (int i = 0; i < d; i++) {
//			int penampung = arr.get(i);
//			arr.add(penampung);
//		}
//		
//		for (int j = 0; j < d; j++) {
//			arr.remove(0);
//		}
//		
//		return arr;
//	}

//    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
//    	for (int i = 0; i < d; i++) {
//    		for (int j = 0; j < arr.size() - 1; j++) {
//    			int temp = arr.get(j);
//    			arr.set(j, arr.get(j + 1));
//    			arr.set(j + 1, temp);
//    		}
//    	}
//    	return arr;
//    }  

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    	for (int i = 0; i < d; i++) {
    		for (int j = 0; j < arr.size() - 1; j++) {
    			int temp = arr.get(j);
    			arr.set(j, arr.get(j + 1));
    			arr.set(j + 1, temp);
    		}
    	}
    	return arr;
    }  
    
	public static void main(String[] args) {
//		List<Integer> array = Arrays.asList(1, 2, 3, 4, 5);
//		rotateLeft(1, array);
		List<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		System.out.println(rotateLeft(2, array));
	}

}
