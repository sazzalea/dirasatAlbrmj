public class test2 {
	
	// public static void populateFibonacciArray(int[] numbers) {
		// int number1 = 0;
		// int number2 = 1;
		// int temp = 0;
		// numbers[0] = number1;
		// numbers[1] = number2;
		// for (int i = 2; i < 15; i++) {
			// temp = number1 + number2;
			// number1 = number2;
			// number2 = temp;
			// numbers[i] = temp;
		// }
	// }
	
	// public static void main(String[] arg) {
		// int[] values = new int[15];
		// populateFibonacciArray(values);
		// for (int i = 0; i < values.length; i++) {
			// System.out.println(i + ". " + values[i]);	
		// }
	// }
	
	public static boolean isPalindrom(int number) {
		boolean result = true;
		int rev = 0;
		for (int i = number; i != 0; i = i / 10) {
			int remainder = i % 10;
			rev = rev * 10 + remainder;
		}
		return rev == number;
	}

	public static void populatePalindromArray(int[] numbers) {
		int count = 0;
		for (int i = 1;; i++) {
			if (isPalindrom(i)) {
				numbers[count] = i;
				count++;
				if(count == numbers.length) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] arg) {
		int[] values = new int [15];
		populatePalindromArray(values);
		for (int i = 0; i < values.length; i++) {
			System.out.println(i + ". " + values[i]);
		}
	}
}