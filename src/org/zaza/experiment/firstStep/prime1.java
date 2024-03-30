public class prime1 {
	
	//13
	//2, 3, 4
	
	public static void main(String []arg) {
		if (arg.length == 0) {
			System.out.println("Berikan angka prima yang dimaksud" );
			return;
		}

		int p = Integer.parseInt(arg[0]);
		boolean isPrime = true;
		int rootp = (int)Math.sqrt(p);  //typecasting
		for (int i = 2; i <= rootp; i++) {
			System.out.println(p + " (coba dibagi) " + i);
			if (p % i == 0) {
				System.out.println(p + " (bisa dibagi) " + i);
				isPrime = false;
				break; 
			}
		}
		
		if (isPrime){
			System.out.println(p + " is prime number");}
		else {
			System.out.println(p + " is not prime number");
		} 
	}
}

/*
	public static void main(String []arg) {
		if (arg.length == 0) {
			System.out.println("Berikan angka prima yang dimaksud" );
		}
		else {
			int p = Integer.parseInt(arg[0]);
			boolean isPrime = true;
			for (int i = 2; i < p; i++) {
				if (p % i == 0) {
					System.out.println(p + " (bisa dibagi) " + i);
					isPrime = false;
					break; 
				}
			}
			
			if (isPrime){
				System.out.println(p + " is prime number");}
			else {
				System.out.println(p + " is not prime number");
			} 
		}
		
			
	}
}
*/

