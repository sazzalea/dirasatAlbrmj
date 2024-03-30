public class prime6 {
	
	public static boolean isPrime(int numbers) {
		boolean result = true;
		int rootp = (int)Math.sqrt(numbers);
		
		for (int i = 2; i <= rootp; i++) {
			if (numbers % i == 0) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	public static void populateArray(int []numbers) {
		int count = 0;
		for (int i = 2; ; i++) {
			if (count == numbers.length){
				break;
			}
			if (isPrime(i)) {	
				numbers[count] = i;
				count++;
			}
		}
	}
	
	public static void showArray(int []numbers) {
		for(int i = 0; i < numbers.length; i++){
			System.out.println(i + " : " + numbers[i] );
		}
	}
	
	public static void reverseArray(int []numbers) {
		if (numbers.length == 0) {
			return;
		}
		
		for (int i = 0; i <= numbers.length / 2; i++) {
			int temp = numbers[(numbers.length - 1) - i];
			numbers[(numbers.length - 1) - i] = numbers[i];
			numbers[i] = temp;
		}
	}
	
	public static void main(String []arg) {
		int p = 0;
		try {
			p = Integer.parseInt(arg[0]);
		}
		catch (Exception e) {
			System.out.println("masukkan angka yang anda maksud!" );
		}
			
		int []primeList = new int[p];
		populateArray (primeList);
		showArray (primeList);
		reverseArray (primeList);
		System.out.println("=====we reversed array=====");
		showArray (primeList);
		
	}
}