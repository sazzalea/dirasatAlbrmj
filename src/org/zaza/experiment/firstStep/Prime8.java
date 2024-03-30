public class Prime8 {
	
	public static boolean isPrime(int numbers) {
		boolean result = true;
		// int p = Math.sqrt();
		
		for (int i = 2; i < numbers; i++) {
			if (numbers % i == 0) {
				result = false;
				break;
			}
			 System.out.println(i);
		}
		return result;
	}
	
	public static void main (String []arg) {
		int p = Integer.parseInt(arg[0]);
		int count = 0;
		for (int i = 2; ; i++) {
			if (isPrime(i)) {
				count++;
				if (count == p) {
					System.out.println(count + ": " + i);
					break;
				}
			}
		}
	}
}