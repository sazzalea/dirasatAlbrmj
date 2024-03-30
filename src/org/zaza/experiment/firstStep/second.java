public class second  {

	public static boolean isEven(int number)  {
		boolean result;
		result = ((number % 2) == 0);
		return result;
	}

	public static int square(int number)  {
		int result;
		result = number * number;
		return result;
	}
		

	public static void main (String []arg)  {
		int totalOdd = 0;
		int totalEven = 0;
		int totalSquare = 0;
		for (int i = 1; i < 100; i++){
			/*if (i % 2 == 0 ) {
				totalEven = totalEven + i;
			}
			else {
				totalOdd = totalOdd + i;
			}*/
			if (isEven(i)) {
				totalEven = totalEven + i;
			}
			else {
				totalOdd = totalOdd + i;
			}
			
			totalSquare = totalSquare + square(i);

		}
		System.out.println( "totalEven is: " + totalEven);
		System.out.println("totalOdd is: " + totalOdd);
		System.out.println("totalSquare is: " + totalSquare);
		
	}
}