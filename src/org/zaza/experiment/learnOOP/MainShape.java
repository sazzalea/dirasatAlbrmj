package org.zaza.experiment.learnOOP;

public class MainShape {
	                         
	public static void executeArea(Circle crc) {
		System.out.println(crc.Area());
	}

	public static void executeArea(Square sqr) {
		System.out.println(sqr.Area());
	}
	
	public static void executeShapeArea(Shape shape) {
		System.out.println(shape.Area());
	}
	
	public static void main(String[] args) {
		Circle circle1 = new Circle(7);
//		Circle.
//		circle1.
//		executeArea(circle1);
//		executeShapeArea(circle1);
		System.out.println(circle1.Area());
		Square square1 = new Square(7);
//		executeArea(square1);
		executeShapeArea(square1);
//		System.out.println(square1.Area());
		Rectangle rectangle1 = new Rectangle(7, 2);
//		System.out.println(rectangle1.Area());
		executeShapeArea(rectangle1);
	}

}
