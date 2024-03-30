public class fibonacci2 {
	
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	
	public static void populateArray(long []numbers) {
		long bilbul1 = 0;
		long bilbul2 = 1;
		numbers[0] = bilbul1;
		numbers[1] = bilbul2;
		for (int i = 2; i < numbers.length; i++) {
			long temp = bilbul1 + bilbul2;
			numbers[i] = temp;
			bilbul1 = bilbul2;
			bilbul2 = temp;
		}
	}
	
	public static void showArray(long []numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i + "; " + numbers[i]);
		}
	}
	
	public static void reverseArray(long []numbers) {
		for(int i = 0; i < numbers.length / 2; i++) {
			//System.out.println("before reverse: " + i + ": " + numbers[i] + "; " + ((numbers.length - 1) - i) + ": " + numbers[(numbers.length - 1) - i]);
			long temp = numbers[(numbers.length - 1) - i];
			numbers[(numbers.length - 1) - i] = numbers[i];
			numbers[i] = temp;
			//System.out.println(" after reverse: " + i + ": " + numbers[i] + "; " + ((numbers.length - 1) - i) + ": " + numbers[(numbers.length - 1) - i]);
			
		}
	}
	
	public static void main(String []arg) {
		
		/*System.out.println("Jumlah argument: " + arg.length);
		for (int i = 0; i < arg.length; i++) {
			System.out.println ("arg's index: " + i + ": " + arg[i]);
		}*/
		
		
		int arrSize = Integer.parseInt(arg[0]);
		
		long []values = new long[arrSize];
		populateArray(values);
		showArray(values);
		reverseArray(values);
		System.out.println("=== We reverse the Fibonacci Seriess ===");
		showArray(values);
	}
}