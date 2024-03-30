public class Random1 {
	
	public static void populateArray(double []numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Math.round(Math.random() * 100);
		}
	}
	
	public static void showArray(double []numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if((numbers[i] >= 0) && (numbers[i] <= 30)) {
				System.out.println(numbers[i] + " : E");
			}
			else if((numbers[i] >= 31) && (numbers[i] <= 45)) {
				System.out.println(numbers[i] + " : D");
			}
			else if((numbers[i] >= 46) && (numbers[i] <= 65)) {
				System.out.println(numbers[i] + " : C");
			}
			else if((numbers[i] >= 66) && (numbers[i] <= 80)) {
				System.out.println(numbers[i] + " : B");
			}
			else{
				System.out.println(numbers[i] + " : A");
			}
		}
	}
	
	public static void reverseArray(double []numbers) {
		for (int i = 0; i < numbers.length / 2; i++) {
			double temp = numbers[(numbers.length - 1) - i];
			numbers[(numbers.length - 1) - i] = numbers[i];
			numbers[i] = temp;
		}
	}
	
	public static void totalArray(double []numbers) {
		double total = 0;
		for (int i = 0; i < numbers.length; i++) {
			total = total + numbers[i];
		}
		System.out.println("the total is: " + total);
	}
	
	public static void main(String []arg) {
		if (arg.length == 0) {
			System.out.println("Masukkkan bilangan yang anda maksud!");
		}
		else{
			double []values = new double [Integer.parseInt(arg[0])];
			populateArray(values);
			showArray(values);
			reverseArray(values);
			System.out.println("=====we reversed array=====");
			showArray(values);
			totalArray(values);
		}
		
		
	}
}