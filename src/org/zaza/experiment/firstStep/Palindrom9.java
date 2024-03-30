public class Palindrom9 {
	
	public static boolean isPalindrome(int number) {
		int rev = 0;
		for (int i = number; i != 0; i = i / 10) {
			int remainder = i % 10;
			rev = rev * 10 + remainder;
		}
		return (number == rev);
	}
	
	public static void main(String[] arg) {
		try {
			int p = Integer.parseInt(arg[0]);
			if (isPalindrome(p)) {
				System.out.println(p + " it is palindrome number");
			}
			else {
				System.out.println(p + " it is not palindrome number");
			}
		}
		catch (Exception e) {
			System.out.println("Masukkan bilangan yang anda inginkan!!!");
		}
	}
}