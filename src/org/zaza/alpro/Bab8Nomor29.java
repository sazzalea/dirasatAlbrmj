package org.zaza.alpro;

import java.util.Scanner;

public class Bab8Nomor29 {
	
	public static boolean equals(int[][] m1, int[][] m2) {
		boolean result = true;
		int angkaDalamM1 = 0;
		int angkaDalamM2 = 0;
		for (int k = 0; k < m1.length ; k++) {
			
			for (int i = 0; i < m1.length; i++) {
				for (int j = 0; j < m1[i].length; j++) {
					angkaDalamM1 = m1[i][j];
				}
			}
		
			for (int i = 0; i < m2.length; i++) {
				for (int j = 0; j < m2[i].length; j++) {
					angkaDalamM2 = m2[i][j];
				}
			}
			
		}
		if (angkaDalamM1 != angkaDalamM2) {
			result = false;
			System.out.println("The two arrays are not identical");
		}
		else {
			System.out.println("The two arrays are identical");
		}
		
		
		return result;
	}

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
        	for (int j = 0; j < arr[i].length; j++) {
	            int angkaDalamArray = scan.nextInt();
	            arr[i][j] = angkaDalamArray;
        	}
        }
        
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < arr2.length; i++) {
        	for (int j = 0; j < arr2[i].length; j++) {
	            int angkaDalamArray = scan.nextInt();
	            arr2[i][j] = angkaDalamArray;
        	}
        }

        equals(arr, arr2);
	}

}
