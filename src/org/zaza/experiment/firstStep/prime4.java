public class prime4 {
	
	public static boolean isPrime(int numbers) {
		boolean result = true;
		int rootp = (int)Math.sqrt(numbers);
		
		for(int i = 2; i <= rootp; i++) {
			if (numbers % i == 0) {
				System.out.println(numbers + " bisa dibagi " + i);
				result = false;
				break;
			}
		}
		return result;
	}
	
	public static void main(String []arg) {
		if (arg.length == 0) {
			System.out.println ("Masukkan bilangan yang anda maksud!");
		}
		else {
			int number = Integer.parseInt(arg[0]);
			if (isPrime(number)) {
				System.out.println (number + " adalah bilangan prima");
			} 
			else {
				System.out.println (number + " bukan bilangan prima");
			}
		}
	}
}