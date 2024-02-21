package org.zaza.eulerAlgorithmJava;

import java.util.Scanner;

public class PlusMinus {
	
	public static void plusMinus(int[] arr) {
		int penampungPositif = 0;
		int penampungNegatif = 0;
		int penampungNol = 0;
		double rasioBilanganPositif = 0;
		double rasioBilanganNegatif = 0;
		double rasioBilanganNol = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				penampungPositif++;
			}
			
			else if (arr[i] < 0) {
				penampungNegatif++;
			}
			
			else {
				penampungNol++;
			}
		}
		rasioBilanganPositif = (double)penampungPositif / arr.length;
		rasioBilanganNegatif = (double)penampungNegatif / arr.length;
		rasioBilanganNol = (double)penampungNol / arr.length;
		System.out.printf("%.6f%n", rasioBilanganPositif);
		System.out.printf("%.6f%n", rasioBilanganNegatif);
		System.out.printf("%.6f%n", rasioBilanganNol);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();

	}

}
