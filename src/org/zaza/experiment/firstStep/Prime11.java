public class Prime11 {
	
	public static boolean isPrime(int number) {
		boolean result = true;
		int sqrt = (int)Math.sqrt(number);
		for (int i = 2; i <= sqrt; i++) {
			if (number % i == 0) {
				result = false;
				// System.out.println(number + " is not prime number");
				break;
			}
		}
		return result;
	}
	
	public static void populateArray(int[] numbers) {
		int count = 0;
		for (int i = 2;; i++) {
			if (isPrime(i)) {
				numbers[count] = i;
				count++;
			}
			if (count == numbers.length) {
				break;	
			}
		}
	
	}
	
	public static void showArray(int[] numbers) {
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
	}

	public static void main(String[] arg) {
		try {
			int p = Integer.parseInt(arg[0]);
			int count = 0;
			int[] primes = new int[p]; 
			// populating array
			// for (int i = 2;; i++) {
				// if (isPrime(i)) {
					// primes[count] = i;
					// count++;
				// }
				// if (count == p) {
					// break;	
				// }
			// } 
			populateArray(primes);
			
			// show array
			// for (int i = primes.length - 1; i >= 0; i--) {
				// System.out.println(primes[i]);
			// }
			showArray(primes);	
		}
		catch (Exception e) {
			System.out.println("Masukkan bilangan yang anda inginkan; " + e.getMessage());
		}
	}
}