package org.zaza.dataStructureNgulang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDS {
	
    public static List<Integer> reverseArray(List<Integer> a) {
    	int temp = 0;
    	for (int i = 0; i < a.size()/2; i++) {
//    		temp = a.get(i);
//    		temp2 = a.get((a.size()-1)-i);
//    		a.set((a.size()-1)-i, temp);
//    		a.set(i, temp2);
    		temp = a.get(i);
    		a.set(i, a.get(a.size()-1-i));
    		a.set(a.size()-1-i, temp);
    	}
    	return a;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(11, 14, 13);
		System.out.println(reverseArray(arr));
	}

}
