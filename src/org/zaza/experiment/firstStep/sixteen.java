public class sixteen {
	
	public static double rectangleArea(double panjang, double lebar) {
		return (panjang * lebar);
	}
	
	public static double triangleArea(double alas, double tinggi) {
		return (alas * tinggi) / 2;
	}
	
	public static double circleArea(double radius) {
		return Math.PI * Math.pow(radius,2);
	}
	
	public static void main(String []arg) {
		for (int i = 1; i < 4; i++) {
			double random1 = Math.round(Math.random() * 100);
			double random2 = Math.round(Math.random() * 100);
			double area = 0;
			//System.out.println("random1 is: " + random1 + " ;random2 is: " + random2);
			//System.out.println("random1 is: " + random1 + ";random2 is: " + random2);
			switch(i) {
				case 1:
					area = rectangleArea(random1, random2);
					break;
				case 2:
					area = triangleArea(random1, random2);
					break;
				default:
					area = circleArea(random1);
					break;
			}
			System.out.println("random1 is: " + random1 + ";random2 is: " + random2 + ";the area is: " + area);
		}
	}
}