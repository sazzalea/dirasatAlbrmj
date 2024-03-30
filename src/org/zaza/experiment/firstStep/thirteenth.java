public class thirteenth {
	
	public static void main(String []arg) {
		
		for(int i = 10; i > 0; i--) {
			double acak = Math.random();
			double kaca = Math.random();
			//double highest;
			
			/*if(acak > kaca) {
				highest = acak;
			}
			else {
				highest = kaca;
			}*/
			//highest = (acak > kaca) ? acak : kaca; 
			
			//System.out.println("first random: " + acak + ", second random: " + kaca + ", the highest is: " + highest);
			System.out.println("first random: " + acak + ", second random: " + kaca + ", the highest is: " + ((acak > kaca) ? acak : kaca));
			
			/*if(acak > kaca) {
				System.out.println("first random: " + acak + ", second random: " + kaca + ", the highest is: " + acak);
			}
			else {
				System.out.println("first random: " + acak + ", second random: " + kaca + ", the highest is: " + kaca);
			}*/
		}
	}
}