public class Palindrom8 {
	
	public static boolean isPalindrome(int number) {
		int rev = 0;
		for (int i = number; i != 0; i = i / 10) {
			int remainder = i % 10;
			rev = rev * 10 + remainder;
		}
		return (number == rev);
	} 
	
	public static void populateArray(int []numbers) {
		int count = 0;
		for (int i = 0; ; i++) {
			if (count == numbers.length) {
				break;
			}
			if (isPalindrome(i)) {
				numbers[count] = i;
				count++;
			}
		}
	}
	
	public static void showArray(int []numbers) {
		for (int i = numbers.length - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(numbers[i]);
			}
			else {
				System.out.print(numbers[i] + "; ");
			}
		}
	}
	
	public static void main(String []arg) {
		try {
			int p = Integer.parseInt(arg[0]);
			int []values = new int[p]; 
			populateArray(values);
			showArray(values);
		}
		catch (Exception e) {
			System.out.println("Masukkan angka yang anda inginkan!!!");
		}
	}
}