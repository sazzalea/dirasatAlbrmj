public class Recursive8 {
	
	public static int factorialLoop(int n) {
		int factorial = 1;
		if (n < 1) {
			return 1;
		}
		int i = n;
		while (i > 0) {
			factorial = factorial * i;
			i--;
		}
		return factorial;
	}
	
	public static int factorialRecursive(int n) {
		if (n <= 1) {
			return 1;
		}
		else {
			return n * factorialRecursive(n-1);
		}
	}
	
	public static void main(String[] arg) {
		System.out.println(factorialLoop(1));
		System.out.println("=================");
		System.out.println(factorialRecursive(1));
	}
}