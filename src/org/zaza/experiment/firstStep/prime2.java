public class prime2 {
	
	public static void main(String []arg) {
		if (arg.length == 0) {
			System.out.println("berikan bilangan yang anda maksud" );
		}
		else {
			int p = Integer.parseInt(arg[0]);
			boolean isPrime = true;
			int rootp = (int)Math.sqrt(p);
			for(int i = 2; i < p; i++) {
				if (p % i == 0) {
					System.out.println (p + " bisa dibagi " + i);
					isPrime = false;
					break;
				}
			}
		
			if (isPrime) {
				System.out.println(p + " adalah bilangan prima");
			}
			else {
				System.out.println (p + " bukan bilangan prima");
			}
		}
	}
}