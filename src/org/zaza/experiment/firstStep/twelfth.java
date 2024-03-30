public class twelfth {
	
	public static void main (String []arg) {
		for (int i = 100; i > 0; i--) {
			double akar = Math.sqrt(i);
			//System.out.println(i + ": " + akar);
			if(akar == (int)akar) {
				System.out.println(i + ": " + akar + " (it is integer)");
			}
			else {
				System.out.println(i + ": " + akar);
			}
		}
	} 
}