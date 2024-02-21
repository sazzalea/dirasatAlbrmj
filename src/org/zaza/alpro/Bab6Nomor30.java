package org.zaza.alpro;

import java.util.Scanner;

public class Bab6Nomor30 {
	
	public static void craps(int num1, int num2) {
		int jumlah = num1 + num2;
		if (jumlah > 12) {
			System.out.println("Angka yang Anda masukkan salah, maksimum penjumlahan kedua angka adalah 12");
		}
		else if (jumlah == 2 || jumlah == 3 || jumlah == 12) {
			System.out.println("You lose.");
		}
		else if (jumlah == 7 || jumlah == 11) {
			System.out.println("You win.");
		}
		else {
			System.out.println("Ulangi undian");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dice1 = input.nextInt();
		int dice2 = input.nextInt();
		craps(dice1, dice2);
	}

}
