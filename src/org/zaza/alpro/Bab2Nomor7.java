package org.zaza.alpro;

import java.util.Scanner;

public class Bab2Nomor7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan angka menit: ");
		int masukan = input.nextInt();
	
		final int menitPerTahun = 525600;
		final int menitPerHari = 1440;
		
		int hasil = masukan / menitPerTahun;
		int hasil2 = (masukan / menitPerHari) - (hasil * 365);
		System.out.println(masukan + " menit setara dengan " + hasil + " tahun dan " + hasil2 + " hari");
	}

}
