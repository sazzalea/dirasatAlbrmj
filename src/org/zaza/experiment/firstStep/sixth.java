public class sixth {
	
	public static void main(String []Arg){
		int calTotal3 = 0;
		for (int i = 0; i < 100; i++){
			//if (i % 3 == 0) {
			if (multiple3(i)) {
				calTotal3 = calTotal3 + i;
				System.out.println (i);
			}
				
		}
		System.out.println (calTotal3);

	}
	
	public static boolean multiple3 (int number) {
		return number % 3 == 0;
		
	}
}