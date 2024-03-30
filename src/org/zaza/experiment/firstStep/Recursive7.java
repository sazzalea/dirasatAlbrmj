public class Recursive7 {
	
	public static int factorialLoop(int n) {
		if (n < 1) {
			return 1;
		}
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
	
	public static int factorialRecursive(int n) {
		if (n < 1) {
			return 1;
		}
		else {
			return n * factorialRecursive(n - 1);
		}
	}
	
	public static int fiboLoop(int n) {
		if (n < 2) {
			return n;
		}
		int number1 = 0;
		int number2 = 1;
		int temp = 0;
		for (int i = 1; i < n; i++) {
			temp = number1 + number2;
			number1 = number2;
			number2 = temp;
		}
		return temp;
	}
	
	public static int fiboRecursive(int n) {
		if (n < 2) {
			return n;
		}
		else {
			return fiboRecursive(n - 1) + fiboRecursive(n - 2);
		}
	}
	
	public static void main(String[] arg) {
		// StringBuilder sb = new StringBuilder();
		// sb.append("Siti ");
		// sb.append("Azzalea ");
		// sb.append(19);
		// String str = sb.toString();
		// System.out.println(str);
		
		
		for (int i = 0; i <= 10; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(i);
			sb.append(". factorialLoop: ");
			sb.append(factorialLoop(i));
			sb.append("; factorialRecursive: ");
			sb.append(factorialRecursive(i));
			String str = sb.toString();
			System.out.println(str);
		}
		// System.out.println("================================");
		// for (int i = 0; i <= 10; i++) {
			// System.out.println(i + ". fiboLoop: " + fiboLoop(i) + "; fiboRecursive: " + fiboRecursive(i));
		// }
	}
}