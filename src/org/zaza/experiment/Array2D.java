package org.zaza.experiment;

public class Array2D {

	public static void main(String[] args) {
		// array 1 dimensi
//		int[] newArray = {1, 2, 3};
		//for (int number: newArray) {
			//System.out.print(number + "  ");
		//}
//		for (int i = 0; i < newArray.length; i++) {
//			System.out.print(newArray[i] + "  ");
//		}
		
		// array 2 dimensi
//		int[][] array2D = {{1, 2, 3, 4},
//							{5, 6, 7, 8, 9},
//							{2, 4, 6}};
//		
//		System.out.println("panjang array2D: " + array2D.length);
//		System.out.println("panjang member array2D #1: " + array2D[0].length);
//		System.out.println("panjang member array2D #2: " + array2D[1].length);
//		System.out.println("panjang member array2D #3: " + array2D[2].length);
		
//		for (int i = 0; i < array2D.length; i++) {
//			System.out.print("Member Array #" + (i+1) + ": ");
//			for (int j = 0; j < array2D[i].length; j++) {
//				System.out.print("  " + array2D[i][j]);
//			}
//			System.out.println();
//		}
//		for (int[] innerArray: array2D) {
//		    for(int data: innerArray) { 
//		    	System.out.print(data + "  ");
//		    }
//		    System.out.println();
//		}
//		for (int i = 0; i < array2D.length; i++) {
//			if (i == 0) {
//				System.out.print("Member array2D pertama: ");
//			}
//			else if (i == 1) {
//				System.out.print("Member array2D kedua: ");
//			}
//			else if (i == 2) {
//				System.out.print("Member array2D ketiga: ");
//			}
//			for (int j = 0; j < array2D[i].length; j++) {
//				System.out.print(array2D[i][j] + "; ") ;
//			}
//
//			System.out.println();
//		}
		
		int[][] myArray = new int[3][3];
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				myArray[i][j] = (int)(Math.random()*100);
				System.out.print(myArray[i][j] + "  ");
			}
			System.out.println();
		}

//		for (int i = 0; i < myArray.length; i++) {
//			for (int j = 0; j < myArray[i].length; j++) {
//				System.out.print(myArray[i][j] + "  ");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 0; i < myArray.length; i++) {
//			for (int j = 0; j < myArray[i].length; j++) {
////				System.out.print(myArray[i][j] + "  ");
//				
//			}
//			System.out.println();
//		}
//		
	}

}
