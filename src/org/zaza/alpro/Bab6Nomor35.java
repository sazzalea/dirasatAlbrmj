package org.zaza.alpro;

import java.util.Scanner;

public class Bab6Nomor35 {

	public static double area(double side) {
		return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double side = input.nextDouble();
		System.out.println(area(side));
	}

}
