public class Multiply3 {
	
	public static void main(String[] arg) {
		int total3 = 0;
		int total5 = 0;
		int total35 = 0;
		int totalAll = 0;
		for (int i = 1; i < 31; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				total35 = total35 + i;
				System.out.println(i + " is multiple of three and five");
			}
			else if (i % 3 == 0) {
				total3 = total3 + i;
				System.out.println(i);
			}
			else if (i % 5 == 0) {
				total5 = total5 + i;
				System.out.println(i);
			}
		}
		totalAll = total3 + total5 + total35;
		System.out.println("the total of multiple 3 is: " + total3);
		System.out.println("the total of multiple 5 is: " + total5);
		System.out.println("the total of multiple 3 and 5 is: " + total35);
		System.out.println("final total is: " + totalAll);

	}
}