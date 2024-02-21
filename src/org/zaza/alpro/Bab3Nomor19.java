package org.zaza.alpro;

import java.util.Scanner;

public class Bab3Nomor19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan sisi-sisi segitiga: ");
		System.out.println("a: ");
		int sisi_a = input.nextInt();
		System.out.println("b: ");
		int sisi_b = input.nextInt();
		System.out.println("c: ");
		int sisi_c = input.nextInt();
		
		if (sisi_a + sisi_b > sisi_c && sisi_b + sisi_c > sisi_a && sisi_a + sisi_c > sisi_b) {
			int keliling = sisi_a + sisi_b + sisi_c;
			System.out.println("Kelilingnya adalah: " + keliling);
		}
		else {
			System.out.println("Angka yang Anda masukkan tidak valid");
		}
	}

}
