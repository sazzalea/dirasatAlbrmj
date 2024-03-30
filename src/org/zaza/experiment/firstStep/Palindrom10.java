public class Palindrom10 {
	
	public static boolean isPalindrome(int number) {
		int rev = 0;
		for (int i = number; i != 0; i = i / 10) {
			int remainder = i % 10;
			rev = rev * 10 + remainder;
		}
		return number == rev;
	}

	public static void populateArray(int[] numbers) {
		int count = 0;
		for (int i = 0; ; i++) {
			if (isPalindrome(i)) {
				numbers[count] = i;
				count++;
			}
			if (count == numbers.length) {
				break;
			}
		}
	}
	
	public static void showArray(int[] numbers) {
		for (int i = numbers.length - 1; i >= 0 ; i--) {
			System.out.println(numbers[i]);
		}
		
	}
	
	public static void main(String[] arg) {
		try {
			int count = 0;
			int p = Integer.parseInt(arg[0]);
			int[] values = new int[p];
			populateArray(values);
			showArray(values);
			
			//populate Array
			// for (int i = 0; ; i++) {
				// if (isPalindrome(i)) {
					// values[count] = i;
					// count++;
				// }
				// if (count == p) {
					// break;
				// }
			// }
			
			// show Array
			// for (int i = 0; i < values.length; i++) {
				// System.out.println(values[i]);
			// }
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}