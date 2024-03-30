public class fifteenth {
	
	public static double rectangleArea(double panjang, double lebar) {
		double result = panjang * lebar;
		return result;
	}
	
	public static double triangleArea(double alas, double tinggi) {
		double result = (alas * tinggi) / 2;
		return result;
	}
	
	public static double circleArea(double radius) {
		double result = Math.PI * Math.pow(radius,2);
		return result;
	}
	
	public static void main(String []arg) {
		for(int i = 1; i <= 3; i++) {
			double random1 = Math.random();
			double random2 = Math.random();
			random1 = Math.round(random1 * 100);
			random2 = Math.round(random2 * 100);
			double area = 0;
			if (i == 1) {
				area = rectangleArea(random1, random2);
			}
			else if (i == 2) {
				area = triangleArea(random1, random2); 
			}
			else {
				area = circleArea(random1);
			}
			System.out.println(i + ", random1: " + random1 + ", random2: " + random2 + "; the area is: " + area);
		}
		
	}
}