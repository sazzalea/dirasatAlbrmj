package org.zaza.eulerDataStructure;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    	List<Integer> result = arr;
    	for (int i = 0; i < d; i++) {
    		int temp = arr.get(i);
    		arr.add(temp);
//    		arr.add(arr.get(i));
    	}
    	for (int j = 0; j < d; j++) {
    		arr.remove(0);
    	}
    	return result;
    }
	
	public static void main(String[] args) {
		List<Integer> lst1 = new ArrayList<>();
		lst1.add(1);
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(5);
		System.out.println(lst1 + " ");
		System.out.println(rotateLeft(2, lst1));
	}

}
