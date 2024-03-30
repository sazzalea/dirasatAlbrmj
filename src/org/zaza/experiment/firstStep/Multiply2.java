public class Multiply2 {
	
	public static void main (String []arg) {
		int total = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				total += i;
				System.out.println (i + " is multiple of three and five");
			}
			else if (i % 3 == 0) {
				total +=  i;
				System.out.println(i);
			}
			else if (i % 5 == 0) {
				total += i;
				System.out.println(i);
			}
		}
		System.out.println(total);
	}
}