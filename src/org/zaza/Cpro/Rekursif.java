package org.zaza.Cpro;

public class Rekursif {
	
	public static void sayHi(int n) {
		if (n == 0) {
			System.out.println("Let's study together at Cpro");
		}
		else {
			System.out.println("Hi!");
			n--;
			sayHi(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHi(5);
	}

}
