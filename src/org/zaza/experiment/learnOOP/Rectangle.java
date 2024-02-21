package org.zaza.experiment.learnOOP;

public class Rectangle extends Shape {
	
	int angka1;
	
	int angka2;
	
	public Rectangle(int number1, int number2) {
		angka1 = number1;
		angka2 = number2;
	}
	
	public double Area() {
		System.out.print("Luas persegi panjang adalah: ");
		return angka1 * angka2;
	}

}
