public class Prime10 {
	
	public static boolean isPrime(int number) {
		boolean result = true;
		int sqrt = (int) Math.sqrt(number);
		for (int i = 2; i < sqrt; i++) {
			if (number % i == 0) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] arg) {
		try {
			int p = Integer.parseInt(arg[0]);
			if (isPrime(p)) {
				System.out.println(p + " is prime number");
			}
			else {
				System.out.println(p + " is not prime number");
			}
		}
		catch (Exception e) {
			System.out.println("Masukkan bilangan yang anda inginkan!!!");
		}
	}
}