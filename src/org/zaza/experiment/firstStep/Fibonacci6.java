public class Fibonacci6 {

	public static void Fibonacci(int[] numbers) {
		int number1 = 0;
		int number2 = 1;
		int temp = 0;
		numbers[0] = number1;
		numbers[1] = number2;
		for (int i = 2 ; i < numbers.length; i++) {
			temp = number1 + number2;
			number1 = number2;
			number2 = temp;
			numbers[i] = temp;
		}
	}
	
	public static void main(String[] arg) {
		int[] values = new int [10];
		Fibonacci(values);
		StringBuilder sb = new StringBuilder();
		for (int i = values.length - 1; i >= 0; i--) {
			sb.append(values[i]);
			sb.append("\n");
		}
		String str = sb.toString();
		System.out.println(str);
	}
}