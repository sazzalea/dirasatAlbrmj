public class nineteen {
	
	public static void populateArray(double []numbers) {  //f(x)=x^2 + 1;  --> f(32)
 		for(int i = 0; i < numbers.length; i++) {
			numbers[i]	 = Math.round(Math.random() * 100);
		}
	}
	
	public static void showArray(double []numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("index: " + (i+1) + "; the value is:" + numbers[i]);
		}
	} 
	
	public static void showTotal(double []numbers) {
		double total = 0;
		for (int i = 0; i < numbers.length; i++) {
			total = numbers[i] + total; 
		}
		System.out.println("the total is: " + total);
	}
	
	public static void main(String []arg) {
		double []values = new double[10]; 
		populateArray(values);
		showArray(values);
		showTotal(values);
	}
}
