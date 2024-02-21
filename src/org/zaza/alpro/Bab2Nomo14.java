package org.zaza.alpro;

import java.util.Scanner;

public class Bab2Nomo14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan berat dalam satuan pound: ");
		double weight = input.nextDouble();
		System.out.print("Masukkan tinggi dalam satuan inci: ");
		double height = input.nextDouble();
		
		final double poundToKilogram = 0.45359237;
		final double inchToMeter = 0.0254;
		
		double convertedWeight = weight * poundToKilogram;
		double convertedHeight = height * inchToMeter;
		double bmi = convertedWeight / (convertedHeight * convertedHeight);
		System.out.println("BMI nya adalah: " + bmi);
	}

}
