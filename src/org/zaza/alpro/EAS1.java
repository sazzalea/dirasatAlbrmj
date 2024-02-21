package org.zaza.alpro;

public class EAS1 {
	
	public static void fr(int n) {
		if (n > 0) {
			fr(n/2);
//			System.out.println("n = " + n + " maka hasilnya " + n%2);
			System.out.print(n%2);
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fr(5);
//		fr(20);
//		System.out.println("memanggil fungsi rekursif");
	}

}
