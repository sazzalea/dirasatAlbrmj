public class fourth {
	
	public static boolean isEven (int number) {
		/*boolean result;
		result = number % 2 == 0;*/
		
		/*boolean result = number % 2 == 0;
		return result;*/
		
		return number % 2 == 0;
	}
	
	public static int square (int number) {
		/*int result;
		result = number * number;
		return result;*/
		
		return number * number;
	}
	
	public static int cal2i3 (int number) {
		int result;
		result = 2 * number +3;
		return result;
	}
	
	public static void main (String []Arg) {
		int totalEven = 0;
		int totalOdd = 0;
		int totalSquare = 0;
		int total2i3 = 0;
		for (int i = 1; i < 100; i++)  {
			if (isEven(i))  {
				totalEven = totalEven + i;
			}
			else {
				totalOdd = totalOdd + i;
			}
			totalSquare = totalSquare + square(i);
			total2i3 = total2i3 + (cal2i3(i));
			System.out.println(i + ", 2i3: " + (cal2i3(i)));
		}
		System.out.println("totalEven is: " + totalEven);
		System.out.println("totalOdd is: " + totalOdd);
		System.out.println("totalSquare is: "+ totalSquare);
		System.out.println("total2i3 is: " + total2i3);
		
	}
	
}