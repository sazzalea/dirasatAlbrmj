public class Random2 {
	
	public static void populateArray (double []number) {
		for (int i = 0; i < number.length; i++) {
			number[i] = Math.round(Math.random() * 100);
		}
	}
	
	public static void showArray (double []numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (i == numbers.length - 1) {
				System.out.print(numbers[i]);
				}
			else {
				System.out.print(numbers[i] + "\t ");
			}	
		}
		System.out.println();
	}
	
	public static void addArray (double []numbers1, double []numbers2, double []total ) {
		for (int i = 0; i < numbers1.length; i++) {
			total[i] = numbers1[i] + numbers2[i];
		}
	}
	
	public static void main(String []arg) {
		try {
			int p = Integer.parseInt(arg [0]);
			double []values1 = new double [p];
			double []values2 = new double [p];
			double []result = new double [p];
			populateArray(values1);
			populateArray(values2);
			showArray(values1);
			showArray(values2);
			addArray(values1, values2, result);
			showArray(result);
		}
		catch (Exception e) {
			System.out.println("terdapat kesalahan!" );
		}
	}
}