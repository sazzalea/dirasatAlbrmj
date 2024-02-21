package org.zaza.experiment.learnOOP;

public class Circle extends Shape {

	
	public Circle(int number) {
		super(number);
		this.angka = number;
	}
	
	public static int staticVar;
	public int nonStaticVar;
	
	public static void TestStaticMethod() {
		
	}
	
	public void TestNonStaticMethod() {
		
	}
	
	public double Area() {
		System.out.print("Luas lingkaran adalah: ");
		return super.Area();
//		return Math.PI * Math.pow(angka, 2);
	}
}
