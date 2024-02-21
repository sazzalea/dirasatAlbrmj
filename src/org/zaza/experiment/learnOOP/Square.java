package org.zaza.experiment.learnOOP;

public class Square extends Shape {

	
	public Square(int number) {
		angka = number;
	}
	
	public double Area() {
		System.out.print("Luas pesegi adalah: ");
		return Math.pow(angka, 2);
	}
}
