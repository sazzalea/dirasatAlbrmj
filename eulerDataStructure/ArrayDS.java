package org.zaza.eulerDataStructure;

public class ArrayDS {

	static int[] reverseArray(int[] a) {
		for (int i = 0; i < a.length/2; i++) {
			int temp = a[(a.length-1)-i];
			a[(a.length-1)-i] = a[i];
			a[i]= temp;
		}
		return a;
    }

	public static void main(String[] args) {
		int[] values = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		for (int i: values) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		
		int[] values2 = reverseArray(values);
		for (int i: values2) {
			System.out.print(i + ", ");
		}
	}

}
