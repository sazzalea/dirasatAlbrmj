public class prime5 {
	
	public static boolean isPrime(int numbers) {
		boolean result = true;
		int rootp = (int)Math.sqrt(numbers);
		
		for (int i = 2; i <= rootp; i++) {
			if (numbers % i == 0) {
				//System.out.println(numbers + " bisa dibagi " + i);
				result = false;
				break;
			}
		}
		return result;
	}
	
	public static void main(String []arg) {
		int count = 0;
		for (int i = 2; ; i++) {
			if (isPrime(i)) {
				//System.out.println(i + " ini bilangan prima ");
				//count = count + 1;
				count++;
				if (count == 100000) {
					System.out.println("bilangan prima ke " + count + " adalah " + i);
					break;
				}
			} 
		}
		System.out.println("jumlah bilangan: " + count);
	}
}