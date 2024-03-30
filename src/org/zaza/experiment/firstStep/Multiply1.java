public class Multiply1 {
	
	public static void main (String[] arg) {
		for (int i = 100; i >= 0; i--) {
			if (i % 2 != 0) {
				if ((i % 5 == 0) && (i % 7 == 0)) {
					System.out.println (i + " is multiple of five and seven");
				}
				else if (i % 5 == 0) {
					System.out.println (i + " is multiple of five");
				}
				else if (i % 7 == 0) {
					System.out.println (i + " is multiple of seven");
				}
				else System.out.println(i);
			}
		}
	}
}