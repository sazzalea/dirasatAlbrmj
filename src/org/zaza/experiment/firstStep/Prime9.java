public class Prime9 {
	
	public static boolean isPrime(int number) {
		boolean result = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				result = false;
				break;
			}
		}
		return result;
	}

	public static void populateArray(int[] numbers) {
		int count = 0;
		for (int i = 2;; i++) {
			if (count == numbers.length) {
				System.out.println("count sudah sejumlah member array, populateArray selesai!");
				break;
			}
			System.out.print("Count=" + count + ". Menguji variabel i=" + i);
			if (isPrime(i)) {
				System.out.println(", prima! Maka masukkan ke array pada index (var count) " + count);
				numbers[count] = i;
				count++;
			}
			else
				System.out.println(", ternyata BUKAN prima, maka lanjut looping");
		}
	}
	
	public static void showArray(int[] numbers) {
		for (int i = numbers.length - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(numbers[i]);
			}
			else {
				System.out.print(numbers[i] + "; ");
			} 
		}
	}
	
	public static void main(String[] arg) {
		try {
			int p = Integer.parseInt(arg[0]);
			int[] values = new int[p];
			populateArray(values);
			showArray(values);
		}
		catch (Exception e) {
			System.out.println("Masukkan bilangan yang anda inginkan!" + e.getMessage());
		}
	}
}