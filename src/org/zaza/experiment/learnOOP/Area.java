package org.zaza.experiment.learnOOP;

public class Area {

	private int length;
	
//	public double circleArea(double number) {
//		 return number * number * Math.PI;
//	}
	
	public Area() {
		System.out.println("constructor area");
	}  

	public Area(int length) {
//		System.out.println(length);
		this.length = length;
//		System.out.println(length);
	} 
	
	public double circleArea() {
		return length * length * Math.PI;
	}

	public double squareArea() {
		return length * length ;
	}
	
//	public static void main(String[] arg) {
//		System.out.print(circleArea(7));
//	}
}
