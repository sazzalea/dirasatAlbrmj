package org.zaza.alpro;

public class Bab6Nomor22 {

	public static double sqrt(long n) {
		double sqrt = 0;
		double lastGuess = 1.5;
		double nextGuess = 0;
		double batas = Math.pow(10, (-10));
		nextGuess = (lastGuess + (n / lastGuess)) / 2;
		if (nextGuess - lastGuess > batas) {
			sqrt = nextGuess;
		}
		return sqrt;
	}
	
	public static void main(String[] args) {
		System.out.println(sqrt(4));
		System.out.println(sqrt(3));
		System.out.println(sqrt(9));
		System.out.println(sqrt(10));
		System.out.println(sqrt(2));
	}

}
