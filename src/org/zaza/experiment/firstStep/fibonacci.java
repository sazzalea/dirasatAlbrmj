public class fibonacci {
	
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

	public static void main(String []arg) {
		long bil1 = 0;
		long bil2 = 1;
		final int max = 20;
		System.out.print("0, 1, ");
		for (int i = 2; i < max; i++) {
			long temp = bil1 + bil2;
			bil1 = bil2;
			bil2 = temp;
			if (i < max-1){
				System.out.print(temp + ", ");
			}
			else{
				System.out.print(temp);
			}
		}

	}
}