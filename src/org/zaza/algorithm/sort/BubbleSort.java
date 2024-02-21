package org.zaza.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 9, 4, 3, -2, 8, 1, 7, 6};
		System.out.println("sebelum diurutkan " + Arrays.toString(arr));
		for (int h = 0; h < arr.length - 1; h++) {
			for (int i = arr.length-1; i > h; i--) {
				if (arr[i] < arr[i-1]) {
					int tmp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = tmp;
				}
//				System.out.print(i + " ");
			}
//			System.out.println("setelah diurutkan ke-"+ h + " " + Arrays.toString(arr));
//			System.out.println();
		}
		System.out.println("setelah diurutkan " + Arrays.toString(arr));
	}

}
