public class RandomMark {
	
	public static void main(String []arg) {			
		int p = 0;

		try {
			p = Integer.parseInt(arg[0]);
		}
		catch (Exception e) {
			System.out.println("terdapat kesalahan karena seharusnya bilangan bulat, pesan dari Java " + e.getMessage());
		} 

		for (int i = 0; i < p ; i++) {
			double random = Math.round(Math.random() * 100);
			//System.out.println(random);
			if ((random >= 0) && (random <= 30)) {
				System.out.println(random + " : E");
			}
			else if ((random >= 31) && (random <=45)) {
				System.out.println(random + " : D");
			}
			else if ((random >= 46) && (random <= 65)) {
				System.out.println(random + " : C");
			}
			else if ((random >= 66) && (random <= 80)) {
				System.out.println(random + " : B");
			}
			else {
				System.out.println(random + " : A");
			}
		}
	}
}


/*	public static void main(String []arg) {
		if (arg.length == 0) {
			System.out.println("Masukkan bilangan yang anda maksud!");
		}
		
		else {
			int p = 0;
			try {
				p = Integer.parseInt(arg[0]);
			}
			catch (Exception e) {
				System.out.println("terdapat kesalahan karena seharusnya bilangan bulat, pesan dari Java " + e.getMessage());
			} 
			
			for (int i = 0; i < p ; i++) {
				double random = Math.round(Math.random() * 100);
				//System.out.println(random);
				if ((random >= 0) && (random <= 30)) {
					System.out.println(random + " : E");
				}
				else if ((random >= 31) && (random <=45)) {
					System.out.println(random + " : D");
				}
				else if ((random >= 46) && (random <= 65)) {
					System.out.println(random + " : C");
				}
				else if ((random >= 66) && (random <= 80)) {
					System.out.println(random + " : B");
				}
				else {
					System.out.println(random + " : A");
				}
			}
		}
	}
*/