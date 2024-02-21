package org.zaza.alpro;

public class Bab6Nomor5 {

	public static void displaySortedNumber(double num1, double num2, double num3) {
		double temp = 0;
		if (num1 > num2 && num1 > num3) {
			temp = num1;
			if (num2 > num3) {
				System.out.println(temp + " " + num2 + " " + num3);
			}
			else {
				System.out.println(temp + " " + num3 + " " + num2);
			}
		}
		
		else if (num2 > num1 && num2 > num3) {
			temp = num2;
			if (num1 > num3) {
				System.out.println(temp + " " + num1 + " " + num3);
			}
			else {
				System.out.println(temp + " " + num3 + " " + num1);
			}
		}
		
		else if (num3 > num1 && num3 > num2) {
			temp = num3;
			if (num1 > num2) {
				System.out.println(temp + " " + num1 + " " + num2);
			}
			else {
				System.out.println(temp + " " + num2 + " " + num1);
			}
		}
		
	}

	public static void main(String[] arg) {
		double a = 0.5;
		double b = 0.56;
		double c = 0.5678;
		displaySortedNumber(a, b, c);
	}
	
}
