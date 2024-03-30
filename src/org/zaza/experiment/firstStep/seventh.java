public class seventh {
	
	public static int square(int number) {
		int result;
		result = number * number;
		return result;
	}
	
	public static void main (String []Arg) {
		int total5 = 0;
		int totalSquare = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 5 == 0) {
				total5 = total5 + i;
				//totalSquare = totalSquare + (i) * (i);
				totalSquare = totalSquare + square(i);
				//System.out.println (i + ": " + (i * i) + ": " + totalSquare);
				System.out.println(i + ": " + (square(i)) + ": " + totalSquare);
			}
			
		}
		System.out.println("total5 is: " + total5);
		System.out.println("totalSquare is: " + totalSquare);
		
	} 
}