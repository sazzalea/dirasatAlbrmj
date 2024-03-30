public class Prime7 {
	
	public static boolean isPrime(int numbers) {
		boolean result = true;
		int rootp = (int)Math.sqrt(numbers);
		
		for (int i = 2; i <= rootp; i++) {
			if (numbers % i == 0) {
				// System.out.println(numbers + " bisa dibagi " + i);
				result = false;
				break;
			}
		}
		return result;
	}
	
	public static void populateArray(int []numbers) {
		int count = 0;
		for (int i = 2; ; i++) {
			if (count == numbers.length) {
				break;
			}
			if (isPrime(i)) {
				numbers[count] = i;
				count++;
			}
		}
	}
	
	public static void showArray(int []numbers) {
		for (int i = 0; i <	 numbers.length ; i++) {
			System.out.println(i + " : " + numbers[i]);
		}
	}
	
	public static void reverseArray(int []numbers) {
		for (int i = 0; i < numbers.length / 2; i++) {
			int temp = numbers[(numbers.length - 1) - i];
			numbers[(numbers.length - 1) - i] =numbers[i];
			numbers[i] = temp;
		}
	}
	
	public static void main(String []arg) {
		if (arg.length == 0) {
			System.out.println("Masukkan bilangan yang anda maksud!!!");
		}
		else {
			int []values = new int[Integer.parseInt(arg[0])];
			populateArray(values);
			showArray(values);
			reverseArray(values);
			System.out.println("=====we reversed the array=====");
			showArray(values);
		}
	}
}