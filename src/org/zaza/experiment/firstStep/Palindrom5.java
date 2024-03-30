public class Palindrom5 {
	
	public static void main (String []arg) {
		String str = arg [0];
		
		boolean isPalindrome = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
			// System.out.println(str.charAt(i));
		}
		if (isPalindrome) {
			System.out.println(str + " is palindrome");
		}
		else {
			System.out.println(str + " is not palindrome");
		}	
	}
}