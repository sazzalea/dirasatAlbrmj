public class twenty {
	
	public static void populateArray(double []numbers) {
		for(int i = 0; i < numbers.length; i++) {
		
			numbers[i] = Math.round(Math.random() * 100);
		}
	}
	
	public static void showArray(double []numbers) {
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("index: " + (i + 1) + "; the values is: " + numbers[i]);
		}
	}
	
	public static void reverseArray(double []numbers) {
		for(int i = 0; i < numbers.length / 2; i++) {
			double temp = numbers[(numbers.length-1) - i];
			numbers[(numbers.length-1) - i] = numbers[i];
			numbers[i] = temp;
		}
	}
	
	public static void main(String []arg) {
		double []values = new double[9];
		populateArray(values);
		showArray(values);
		reverseArray(values);
		System.out.println("==========");
		showArray(values);
	}
}