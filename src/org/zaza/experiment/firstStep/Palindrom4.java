public class Palindrom4 {
	
	public static boolean isPalindrom(int number) {
		int rev = 0;
		for (int q = number; q != 0; q = q / 10) {
			rev = (rev * 10) + (q % 10);
		}
		return (number == rev);
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
		for (int i = 0; i < numbers.length / 2; i++) {
			int temp = numbers[(numbers.length - 1) - i];
			numbers[(numbers.length - 1) - i] = numbers[i];
			numbers[i] = temp;
		}
	}
	
	public static void main(String []arg) {
		try {
			int p = Integer.parseInt(arg[0]);
			int []values = new int[p];
			populateArray(values);
			showArray(values);
			reverseArray(values);
			System.out.println("=====we reversed the array=====");
			showArray(values);
		}
		catch (Exception e) {
			System.out.println("terdapat kesalahan!");
		}
		
	}
}