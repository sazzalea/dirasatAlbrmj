package org.zaza.algorithm.sort;
 
import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {5, 3, 4, 2, 6, 1, 7, 4,  9, 8, 5};
		System.out.println(Arrays.toString(arr));
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
