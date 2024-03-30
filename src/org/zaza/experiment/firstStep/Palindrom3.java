public class Palindrom3 {
	
	public static boolean isPalindrom(int numbers) {
		boolean result = true;
		
		int q = numbers;
		int rev = 0;
		for(;q != 0;) {
			int remainder = q % 10;
			q = q / 10;
			rev = rev * 10 + remainder;
			// System.out.println(rev);
		}
		if (numbers == rev) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
	
	public static void populateArray(int []numbers) {
		int count = 0;
		for (int i = 0; ; i++) {
			if (count == numbers.length) {
				break;
			}
			if (isPalindrom(i)) {
				numbers[count] = i;
				count++;
			}
		}
	}
	
	public static void showArray(int []numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i + " : " + numbers[i]);
		}
	}
	
	public static void reverseArray(int []numbers) {
		for (int i = 0; i <= numbers.length / 2; i++) {
			int temp = numbers[(numbers.length - 1) - i];
			numbers[(numbers.length - 1) - i] = numbers[i];
			numbers[i] = temp;
		}
	}
	
	public static void main(String []arg) {
		int []values = new int [100]; 
		populateArray(values);
		showArray(values);
		reverseArray(values);
		System.out.println("======we reversed the array======");
		showArray(values);
	}
}