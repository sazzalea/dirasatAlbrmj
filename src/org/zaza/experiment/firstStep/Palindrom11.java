public class Palindrom11 {
	
	public static boolean isPalindrome(int number) {
		int rev = 0;
		int i = number;
		while (i != 0) {
			int remainder = i % 10;
			rev =  rev * 10 + remainder;
			// System.out.println(rev);
			i = i / 10;
		}
		return rev == number;
	}
	
	public static void populateArray(int[] numbers) {
		int count = 0;
		int i = 0;
		while (true) {
			if (isPalindrome(i)) {
				numbers[count] = i;
				count++;
			}
			if (count == numbers.length) {
				break;
			}
			i++;
		}
	} 
	
	public static void showArray(int[] numbers) {
		int i = numbers.length - 1;
		while (i >= 0) {
			System.out.println(i + ". " + numbers[i]);
			i--;
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
			// System.out.println(e.getMessage());
			e.printStackTrace();
		}
	} 
}