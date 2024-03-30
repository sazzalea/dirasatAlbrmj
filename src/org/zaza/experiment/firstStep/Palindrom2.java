/*
1234 mod 10 = 4 --> 1234 / 10 = 123 --> 0 * 10 + 4 = 4
123 mod 10 = 3 --> 123 / 10 = 12    --> 4 * 10 + 3 = 43
12 mod 10 = 2 --> 12 / 10 = 1       --> 43 * 10 + 2 = 432
1 mod 10 = 1 --> 1 / 10 = 0         --> 432 * 10 + 1 = 4321 */

public class Palindrom2 {
	
	public static boolean isPalindrome(int numbers) {
		int rev = 0;
		for (int q = numbers; q != 0; q = q / 10 ) {
			rev = (rev * 10) + (q % 10);
			// System.out.println(rev);
		}
		return (numbers == rev);
	} 
	
	public static void main(String []arg) {
		int number = 0;
		try {
			number = Integer.parseInt(arg[0]);
			if (isPalindrome(number)) {
				System.out.println(number + " it is palindrome ");
			}
			else {
				System.out.println(number + " not a palindrome");
			}
		}
		catch (Exception e){
			System.out.println("Masukkan angka yang anda maksud!!; ");
		}
	}
}