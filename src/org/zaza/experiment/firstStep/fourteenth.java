public class fourteenth {
	
	public static double area(double panjang, double lebar) {
		double result;
		result = panjang * lebar;
		return result;
	}
	
	public static void main(String []arg) {
		for(int i = 0; i < 10; i++) {
			double acak1 = Math.random() * 100;
			double acak2 = Math.random() * 100;
			acak1 = Math.round(acak1);
			acak2 = Math.round(acak2);
			//double rectangle = acak1 * acak2;
			System.out.println("acak1: " + acak1 + "; acak2: " + acak2 + "the area is: " + area(acak1, acak2));
		}
	}
}