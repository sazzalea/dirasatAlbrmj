package org.zaza.alpro;

public class EAS2 {
	
	public static int func(int n) {
		if (n == 0) {
			return n + 1;
		}
		else {
			return func(n - 1) + 3;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(func(5));
	}

}
