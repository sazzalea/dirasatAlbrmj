package org.zaza.eulerAlgorithmJava;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String kalimat = "";
		int angka = 0;
		while (sc.hasNext()) {
			kalimat = sc.nextLine();
			System.out.println(++angka + " " + kalimat);
		}
	}

}
