public class Palindrom6 {
	
	public static boolean isPalindrome(int number) {
		boolean result = true;
		int rev = 0;
		for (int q = number; q != 0; q = q / 10) {
			int remainder = q % 10;
			rev = rev * 10 + remainder;
		}
		if (rev == number) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	} 
	
	public static void main(String []arg) {
		try {
			int p = Integer.parseInt(arg[0]);
			if (isPalindrome(p)) {
				System.out.println("it is palindrome");
			}
			else {
				System.out.println("it is not palindrome");
			}
		}
		catch (Exception e) {
			System.out.println("Masukkan angka yang anda inginkan!!!");
		}
	}
}
// i = i + 2
// 1234 % 10 ---> 1234 / 10 = 123 sisa 4 ---> 0 * 10 + 4 = 4
// 123 % 10 ---> 123 / 10 = 12 sisa 3 ---> 4 * 10 + 3 = 43
// 12 % 10 ---> 12 / 10 = 1 sisa 2 ---> 43 * 10 + 2 = 432
// 1 % 10 ---> 1 / 10 = 0 sisa 1 ---> 432 * 10 + 1 =4321