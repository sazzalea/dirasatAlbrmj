public class Random3 {
	
	public static void main(String[] arg) {
		int totalEven = 0;
		int totalOdd = 0;
		for (int i = 1; i <= 6; i++) {
			double random = Math.random() * 100;
			int randomInt = (int)random;
			// System.out.println(i + ". " + randomInt);
			if (randomInt % 2 == 0) {
				totalEven += randomInt;
				System.out.println(i + ". " + randomInt + " is even");
			}
			else {
				totalOdd += randomInt;
				System.out.println(i + ". " + randomInt + " is odd");
			}
		}
		System.out.println("total of even is: " + totalEven);
		System.out.println("total of odd is: " + totalOdd);
	}
	
}