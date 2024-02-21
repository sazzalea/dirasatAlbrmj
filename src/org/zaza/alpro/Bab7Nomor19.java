package org.zaza.alpro;

import java.util.Scanner;

public class Bab7Nomor19 {
	
	public static boolean isSorted(int[] list) {
		boolean result = true;
		int bil1= 0;
		int bil2 = 0;
		for (int i = 0; i < list.length - 1; i++) {
			bil1 = list[i];
			bil2 = list[i + 1];
//			System.out.println("bil1 = " + bil1 + "; bil2 = " + bil2);
		}
		if (bil2 - bil1 >= 0) {
			System.out.println("The list is already sorted");
		}
		else {
			result = false;
			System.out.println("The list is not sorted");
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int panjangArray = input.nextInt();
		int[] arr = new int[panjangArray];
        for (int i = 0; i < arr.length; i++) {
            int angkaDalamArray = input.nextInt();
            arr[i] = angkaDalamArray;
        }		
        isSorted(arr);
	}

}
