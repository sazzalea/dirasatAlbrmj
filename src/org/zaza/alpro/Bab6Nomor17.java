package org.zaza.alpro;

public class Bab6Nomor17 {

	public static void printMatrix(int n) {
		for (int baris = 1; baris <= n; baris++) {
			for (int kolom = 1; kolom <= n; kolom++) {
				int a = (int)Math.round(Math.random());
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMatrix(3);
//		int b = (int)Math.round(Math.random());
//		System.out.print(a + " " + b);
	}
	

}
