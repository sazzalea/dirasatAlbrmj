public class Palindrom7 {
	
	public static boolean isPalindrome(int number) {
		boolean result = true;
		int rev = 0;
		for (int i = number; i != 0; i = i / 10) {
			int remainder = i % 10;
			rev = rev * 10 + remainder;
		}
		if(number == rev) {
			result = true;
			System.out.println(rev);
		}
		else {
			result = false;
		}
	
		return result;
	}
	
	public static void main(String []arg) {
		int p = Integer.parseInt(arg[0]);
		int count = 0;
		for (int i = 0; ; i++){
			if (isPalindrome(i)) {
				if (count == p) {
					System.out.println(i);
					break;
				}
				count++;
			}
		}
	}
}