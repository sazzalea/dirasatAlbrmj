public class Factorial4 {
	
	public static int factorial(int number) {
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}
	
	public static void main(String[] arg) {
		try {
			int p = Integer.parseInt(arg[0]);
			System.out.println(factorial(p));
		}
		catch (Exception e) {
			System.out.println("Masukkan bilangan yang anda inginkan!!!");
		}
	}
}