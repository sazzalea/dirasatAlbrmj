public class tenth {
	
	public static void main(String []Arg) {
		int total = 0;
		for(int i = 0; i < 100; i++) {
			if (!(i % 3 == 0)) {
			//if((i % 3 == 0) && (i % 5 == 0)) {
			//if((i % 3 == 0) || (i % 5 == 0)) {
				System.out.println(i);
				total = total + i;
			}
		}
		System.out.println(total);

	}
}