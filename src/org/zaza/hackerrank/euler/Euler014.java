package org.zaza.hackerrank.euler;
import java.io.*;
import java.util.*;

public class Euler014 {
	
	static int[] collatzStepList = new int[5000000 + 1];
	
	public static int dugaanCollatz(int number) {
		if (collatzStepList[number] > 0) {
			return collatzStepList[number];
		}
		int counter = 0;
//		System.out.print("step: " + number + " ");
		for (; number > 1; ) {
			if (number % 2 == 0) {
				number = number / 2;
			}
			else {
				number = (3 * number) + 1;
			}
			counter++;
//			System.out.print(number + " ");
		}
//		System.out.println();
		collatzStepList[number] = counter;
		return counter;
	}
	
	public static int highestStep(int number) {
		int highestCounter = 0;
		int numberWithHighestCounter = 0;
		for (int i = 1; i <= number; i++) {
			int yangMauDicari = dugaanCollatz(i);
//			System.out.println(i + ": " + yangMauDicari);
			if (highestCounter <= yangMauDicari) {
				highestCounter = yangMauDicari;
				numberWithHighestCounter = i;
//				System.out.println(i + " -> " + highestCounter);
//				highestCounter = i;
			}
		}
		return numberWithHighestCounter;
	}
	
    public static void main(String[] args) {
//	      Scanner in = new Scanner(System.in);
//	      int t = in.nextInt();
//	      for(int a0 = 0; a0 < t; a0++){
//	          int n = in.nextInt();
//		    	System.out.println(highestStep(n));
//	      }
    	System.out.println(dugaanCollatz(1000));
//    	System.out.println(dugaanCollatz(19));
//    	System.out.println(highestStep(20));
    }

}
