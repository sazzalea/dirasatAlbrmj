package org.zaza.alpro;

import java.util.Scanner;

public class Bab5Nomor16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int angka = input.nextInt();

		boolean primeNumber = true;
		int sqrt = (int)Math.sqrt(angka);
		System.out.print(2 + " ");
		for (int i = 3; i < sqrt ; i += 2) {
			if (angka % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
