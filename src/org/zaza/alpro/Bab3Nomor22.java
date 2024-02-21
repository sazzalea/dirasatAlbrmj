package org.zaza.alpro;

import java.util.Scanner;

public class Bab3Nomor22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan titik-titik koordinat: ");
		int koordinatXBaru = input.nextInt();
		int koordinatYBaru = input.nextInt();
		
		int jarakAntaraKoordinatX = (koordinatXBaru - 0) * (koordinatXBaru - 0);
		int jarakAntaraKoordinatY = (koordinatYBaru - 0) * (koordinatYBaru - 0);
		int jumlahJarak = jarakAntaraKoordinatX + jarakAntaraKoordinatY; 
		int jarakTitikAwalKeTitikBaru = (int)Math.sqrt(jumlahJarak);
		
		if (jarakTitikAwalKeTitikBaru <= 10) {
			System.out.println("Titik " + koordinatXBaru + ", " + koordinatYBaru + " berada dalam lingkaran");
		}
		else {
			System.out.println("Titik " + koordinatXBaru + ", " + koordinatYBaru + " berada di luar lingkaran");
		}
	}

}
