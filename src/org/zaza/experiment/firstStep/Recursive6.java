public class Recursive6 {
	
	public static int fibonacciLoop(int n) {
		if (n < 2) {
			return n;
		}
		int number1 = 0;
		int number2 = 1;
		int temp = 0;
		int i = 1;
		while (i < n) {
			temp = number1 + number2;
			number1 = number2;
			number2 = temp;
			i++;
		}
		return temp;
	}
	public static int fibonacciRekursi(int n) {
		if (n < 2) {
			return n;
		}
		else {
			return fibonacciRekursi(n - 1) + fibonacciRekursi(n - 2);
		}
	}
	
	public static void main(String[] arg) {
		System.out.println(fibonacciLoop(10));
		System.out.println("======================");
		System.out.println(fibonacciRekursi(10));
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + ", dengan loop: " + fibonacciLoop(i) + "; dengan rekursi: " + fibonacciRekursi(i));
		}
	}
}