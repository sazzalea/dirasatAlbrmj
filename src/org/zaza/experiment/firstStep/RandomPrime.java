public class RandomPrime {
	
	public static boolean isPrime(int numbers) {
		boolean result = true;
		int rootp = (int) Math.sqrt(numbers);
		
		if (numbers <= 1) {
			return false;
		}
		
		for (int i = 2; i <= rootp; i++) {
			if (numbers % i == 0) {
				//System.out.println(numbers + " bukan bilangan prima");
				result = false;
				break;
			}
		}
		return result;
	}
	
	public static void main(String []arg) {
		int count = 0;
		for (int i = 0; ; i++){
			count++;
			int random = (int)(Math.random() * 100);
			
			if (isPrime(random)) {
				System.out.println(random + " adalah bilangan prima setelah percobaan ke " + count);
				break;
			}
		}
	}
}