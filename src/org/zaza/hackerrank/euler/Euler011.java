package org.zaza.hackerrank.euler;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Euler011 {
	
	public static int getLargestProduct(int[][] arr) {
		int product = 1;
//		 System.out.println("START");
		int largestProduct = 0;
		//horizontal
		 for (int i = 0; i < arr.length; i++) {
			 for (int j = 0; j < arr[i].length - 3; j++) {
				 product = arr[i][j] * arr[i][j + 1] * arr[i][j + 2] * arr[i][j + 3];
//				 System.out.println(arr[i][j]  + " - "  + arr[i][j + 1]  + " - " + arr[i][j + 2] + " - " + arr[i][j + 3]);
					 if (largestProduct < product) {
						 largestProduct = product;
				 }
			 }
//			 System.out.println("====================================");
		 }
//		 vertical
		 for (int i = 0; i < arr.length - 3; i++) {
			 for (int j = 0; j < arr[i].length; j++) {
				 product = arr[i][j] * arr[i + 1][j] * arr[i + 2][j] * arr[i + 3][j];
					 if (largestProduct < product) {
						 largestProduct = product;
				 }
			 }
		 }
//		 diagonal from up to down
		 for (int i = 0; i < arr.length - 3; i++) {
			 for (int j = 0; j < arr[i].length - 3; j++) {
				 product = arr[i][j] * arr[i + 1][j + 1] * arr[i + 2][j + 2] * arr[i + 3][j + 3];
					 if (largestProduct < product) {
						 largestProduct = product;
				 }
			 }
		 }
//		 diagonal down to up
		 for (int i = 0; i < arr.length - 3; i++) {
			 for (int j = 3; j < arr.length; j++) {
				 product = arr[i][j] * arr[i + 1][j - 1] * arr[i + 2][j - 2] * arr[i + 3][j - 3];
					 if (largestProduct < product) {
						 largestProduct = product;
				 }
			 }
		 }
		 
		 
		return largestProduct;
	} 
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getLargestProduct(grid));
    }

}
