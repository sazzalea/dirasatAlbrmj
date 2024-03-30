public class Palindrom13 {
	
	public static boolean isPalindrome(int number) {
		boolean result = false;
		int rev = 0;
		for (int i = number; i != 0; i = i / 10) {
			int remainder = i % 10;
			rev = rev * 10 + remainder;
		}
		return number == rev;
	}
	
	public static void populateArray(int[] numbers) {
		int count = 0;
		for (int i = 1;; i++) {
			if (isPalindrome(i)) {
				if (count == numbers.length) {
					break;
				}
				numbers[count] = i;
				count++;
			}
		}
	}
	
	public static void showArray(int[] numbers) {
		int sequence = 1;
		for(int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(sequence++ + ". " + numbers[i]);
		}
	}
	
	public static void main(String[] arg) {
		int[] values = new int[50];
		populateArray(values);
		showArray(values);
	}
}