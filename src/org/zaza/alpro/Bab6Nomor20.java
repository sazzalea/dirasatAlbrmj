package org.zaza.alpro;

import java.util.Scanner;

public class Bab6Nomor20 {
	
	public static int countLetters(String s) {
		return s.length();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String letter = input.next();
		System.out.println(countLetters(letter));
	}

}
