package org.zaza.algorithm.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {8, 6, 3, 1, 7, -2, 4, -5, 9};
		for (int h = 0; h < arr.length-1; h++) {
			int smallest = Integer.MAX_VALUE;
			int indexSmallest = 0;
			for (int i = arr.length-1; i >= h ; i--) {
				if (smallest > arr[i]) {
					smallest = arr[i];
					indexSmallest = i;
				}
			}
			int temp = arr[indexSmallest];
			arr[indexSmallest] = arr[h];
			arr[h] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
