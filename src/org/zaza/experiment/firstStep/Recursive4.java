public class Recursive4 {
	
	public static int akumulasiLoop(int n) {
		int total = 0;
		int i = n;
		while (i >= 0) {
			total += i; 
			i--;
		}
		return total;
	}
	
	public static int akumulasiRekursi(int n) {
		if (n == 0) {
			System.out.println(n);
			return 0;
		}
		else {
			int total = n + akumulasiRekursi(n - 1);
			return total;
		}
	}
	
	public static int factorialLoop (int n) {
		int total = 1;
		for (int i = n; i > 0; i--) {
			total *= i;
		}
		return total;
	}
	
	public static int factorialRekursi(int n) {
		if (n <= 1) {
			return 1;
		} 
		else {
			return (n * factorialRekursi(n - 1));
		}
	}
	
	public static void main(String[] arg) {
		System.out.println("akumulasi dengan loop: " + akumulasiLoop(4));
		System.out.println("============================");
		System.out.println("akumulasi dengan rekursi: " + akumulasiRekursi(4));
		System.out.println("============================");
		System.out.println("factorial dengan loop: " + factorialLoop(0));
		System.out.println("============================");
		System.out.println("factorial dengan rekursi: " + factorialRekursi(0));
	}
}