public class Prime12 {
	
	public static boolean isPrime(int number) {
		boolean result = true;
		int i = 2;
		int sqrt = (int)Math.sqrt(number);
		while (i <= sqrt) {
			if (number % i == 0) {
				result = false;
				break;
				
			}
			i++;
		}
		return result;
	}
	
	public static void populateArray(int[] numbers) {
		int count = 0, i = 2;
		while (true) {
			if (isPrime(i)) {
				numbers[count] = i;
				count++;
			}
			if (count == numbers.length) {
				break;
			}
			i++;
		}
	}
	
	public static void showArray(int[] numbers) {
		int i = numbers.length - 1;
		while (i >= 0) {
			System.out.println(numbers[i]);
			i--;
		}
	}
	
	public static void main(String[] arg) {
		try {
			int p = Integer.parseInt(arg[0]);
			int[] values = new int [p];
			populateArray(values);
			showArray(values)                                                           ;
			// int count = 0, i = 2; 
			// while (true) {
				// if (isPrime(i)) {
					// values[count] = i;
					// count++;
					// System.out.println(count + ". " + i);
				// }
				// if (count == p) {
					// break;
				// }
				// i++;
			// }
			
			// int i = values.length - 1;
			// while (i >= 0) {
				// System.out.println(i + ". " + values[i]);
				// i--;
			// }
		}
		catch (Exception e) {
			System.out.println(e. getMessage()); 
		}
	}
	
}

		/*
		for (int i = 0; //initialization
				i < 10; //limit
				i++) {  //step
			System.out.println(i + ".");
		}
		*/
		/*
		int i = 0;
		while (i < 10) {
			System.out.println(i + ",");
			i++;
		}
		*/
