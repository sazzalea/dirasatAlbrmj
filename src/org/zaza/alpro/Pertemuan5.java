package org.zaza.alpro;

import java.util.Scanner;

public class Pertemuan5 {

	public static int rectangleArea(int panjang, int lebar) {
		int luas = panjang * lebar;
		return  luas;
	}
	
	public static void main(String[] args) {
		//to the bone_Pamungkas
//		System.out.println("take me home i'm fallin'");
//		System.out.println("love me long, i'm rollin'");
//		System.out.println("losing control, body and soul");
//		System.out.println("mind too for sure, i'm already yours");
//		System.out.println("walk you down, i'm all in");
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//
//		System.out.println("Luas persegi panjang: " + rectangleArea(4,6));
//		System.out.println("Luas persegi panjang: " + rectangleArea(16,12));
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		try {
			Scanner nilai = new Scanner(System.in);
			double angka = nilai.nextDouble();
			double[] daftarNilai = {angka};
			double tempatNilai = 0;
			double rerata = 0;
			for (int i = 0; i < daftarNilai.length; i++) {
				tempatNilai += daftarNilai[i];
				rerata = tempatNilai / daftarNilai.length;
			}
			System.out.println("reratanya adalah: " + rerata);
		}
		catch (Exception e) {}
	}

}
