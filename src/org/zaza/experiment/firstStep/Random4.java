public class Random4 {
	
	public static void main(String[] arg) {
		for (int i = 0; i <= 10; i++) {
			double acak1 = Math.random();
			double acak2 = Math.random();
			// if (acak1 > acak2) {
				// System.out.print("first random: " + acak1 + "; second random: " + acak2 + ", the highest is: " + acak1);
			// }
			// else {
				// System.out.println("first random: " + acak1 + "; second random: " + acak2 + ", the highest is: " + acak2);
			// }
			
			double highest = (acak1 > acak2) ? acak1 : acak2;
			System.out.println("first random: " + acak1 + "; second random: " + acak2 + ", the highest is: " + highest);
			// System.out.println("first random: " + acak1 + "; second random: " + acak2 + ", the highest is: " + ((acak1 > acak2) ? acak1 : acak2));
		}
	} 
}