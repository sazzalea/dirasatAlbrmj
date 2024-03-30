public class Palindrom12 {
	
	public static boolean isPalindrome(int number) {
		boolean result = false;
		int rev = 0;
		for (int i = number; i != 0; i = i/10) {
			int remainder = i % 10;
			rev = rev * 10 + remainder;
		}
		return number == rev;
	}
	
	public static void main(String[] arg) {
		int[] values = new int[100];
		int count = 0;
		for (int i = 0; ; i++) {
			if (isPalindrome(i)) {
				if (count == 100) {
					break;
				}
				values[count] = i;
				count++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = values.length - 1; i >= 0; i--) {
			sb.append(i);
			sb.append(". ");
			sb.append(values[i]);
			sb.append("\n");
		}
		String str = sb.toString();
		System.out.println(str);
	}
}