public class Fibonacci4 {
	
	public static void populateArray(int []numbers) {
		int bilbul1 = 0;
		int bilbul2 = 1;
		numbers[0] = bilbul1;
		numbers[1] = bilbul2;
		for(int i = 2; i < numbers.length; i++) {
			int temp = bilbul1 + bilbul2;			
			numbers[i] = temp;
			bilbul1 = bilbul2;
			bilbul2 = temp;
		}
	}
	
	public static void showArray(int []numbers) {
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
		
	public static void reverseArray(int []numbers) {
		for(int i = 0; i < numbers.length / 2; i++) {
		int temp = numbers[(numbers.length - 1) - i];
		numbers[(numbers.length - 1) - i] = numbers[i];
		numbers[i] = temp;
		}
	}
	
	public static void main(String []arg) {
		if (arg.length == 0) {
			System.out.println("Masukkan bilangan yang anda maksud!!!");
		}
		else{
			int []values = new int[Integer.parseInt(arg[0])];
			populateArray(values);
			showArray(values);
			reverseArray(values);
			System.out.println("=====we reversed the array=====" );
			showArray(values);
		}
	}
}