package org.zaza.alpro;

import java.util.Scanner;

public class Bab2Nomor9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan angka kecepatan awal: ");
		double kecepatanAwal = input.nextDouble();
		System.out.print("angka kecepatan akhir: ");
		double kecepatanAkhir = input.nextDouble();
		System.out.print("angka waktu: ");
		double waktu = input.nextDouble();
		
		double kecepatanRerata = (kecepatanAkhir - kecepatanAwal) / waktu;
		System.out.println("kecepatan rata-ratanya adalah " + kecepatanRerata);
	}

}
