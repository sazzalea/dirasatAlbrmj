package org.zaza.hackerrank.euler;
import java.io.*;
import java.util.*;

public class Euler012 {
	
	public static void cariBilanganSegitiga(int batasJumlahPembagi) {
    	int hasil = 0;
    	for (int i = 1; ; i++) {
    		hasil += i;
    		if (tesFaktor2(hasil, batasJumlahPembagi)) {
    			System.out.println(hasil);
    			break;
    		}
    	}
	} 
	
//	public static boolean tesFaktor(int angka, int batas) {
//		boolean result = false;
//		int counter = (angka % 2 == 0 ? 1 : 0);
//		System.out.println("memulai counter: " + counter);
//		int sqrt = (int)Math.sqrt(angka);
//		if (sqrt * sqrt == angka) {
//			counter--;
//		}
//		for (int i = (angka % 2 == 0 ? 2 : 1); i <= sqrt; i += 2) {
//			if (angka % i == 0) {
//				counter += 2;
//				if (counter > batas) {
//					result = true;
//					break;
//				}
//			}
//		}
//		return result;
//	}
	
	public static boolean tesFaktor2(int angka, int batas) {
		boolean result = false;
		int counter = 0;
		int sqrt = (int)Math.sqrt(angka);
		
		if (sqrt * sqrt == angka) {
			counter--;
		}
		
		if (angka % 2 != 0) {
			for (int i = 1; i <= sqrt; i += 2) {
				if (angka % i == 0) {
					counter += 2;
					if (counter >= batas) {
						result = true;
						break;
					}
				}
			}
		}
		
		else {
			for (int i = 1; i <= sqrt; i++) {
				if (angka % i == 0) {
					counter += 2;
					if (counter >= batas) {
						result = true;
						break;
					}
				}
			}
		}
		return result;
	}
	
	public static void cariBilanganSegitiga2(int[] arr) {
    	int hasil = 0;
    	int counter = 2;
    	arr[1] = 1;
    	for (int i = 1; counter < arr.length; i++) {
    		hasil += i;
    		if (tesFaktor2(hasil, counter)) {
    			if (arr[counter] == 0) {
        			arr[counter] = hasil;
    				counter += 2;
    			}
    		}
    	}
	} 
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	int[] triangleArray = new int[1000];
    	cariBilanganSegitiga2(triangleArray);
//    	System.out.println(Arrays.toString(triangleArray));
	      Scanner in = new Scanner(System.in);
	      int t = in.nextInt();
	      for(int a0 = 0; a0 < t; a0++){
	          int n = in.nextInt();
	          System.out.println(triangleArray[n + 1] == 0 ? triangleArray[n + 2] : triangleArray[n + 1] );
	      }
//    	System.out.println(tesFaktor2(3, 1));
//    	System.out.println(tesFaktor2(6, 3));
//    	System.out.println(tesFaktor2(21, 4));
    }

}
