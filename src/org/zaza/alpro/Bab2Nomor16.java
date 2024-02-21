package org.zaza.alpro;

import java.util.Scanner;

public class Bab2Nomor16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan angka sisi: ");
		double sisi = input.nextDouble();
		
		final double konstanta = (3 * Math.sqrt(3)) / 2;
		
		double luasHexagon = konstanta * (sisi * sisi);
		System.out.println("Luas hexagonal dari sisi yang diberikan adalah: " + luasHexagon);
	}

}
