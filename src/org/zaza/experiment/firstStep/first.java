public class first {
	
	public static void main (String []arg) {
		//System.out.println("hi!");
		/*
		System.out.println("hi!" + 2);
		System.out.println("1 + 2");
		*/	
		/*int x = 4;
		int y = 5;
		int z;
		z = x * y + y;  // menghitung z
		System.out.println(z);
		System.out.println(x * y);
		
		boolean benar = (x == 14); //true;
		boolean salah = false;
		System.out.println(benar);
		System.out.println(x);*/
		
		/*int bilbul = 0;
		if (bilbul > 0)
			System.out.println("value of bilbul is : " + bilbul + " so it is positive ");
		else if ( bilbul < 0 )
			System.out.println("value of bilbul is : " + bilbul + " so it is negative ");
		else { 
			System.out.println("value of bilbul is : " + bilbul + " so it is zero ");
			System.out.println("value jadi nilainya nol");
		}*/
		/*int total = 0;
		for (int i = 1; i < 10; i++){ 
			int kuadrat = i * i; 
			System.out.println(i + ": " + kuadrat + ", total sebelum ditambah = " + total);
			total = total + kuadrat;
			System.out.println(i + ": " + kuadrat + ", total setelah ditambah = " + total);
			System.out.println();
		}
		System.out.println("total: " + total  );*/

		int totalOdd = 0;
		int totalEven =0;
		for (int i = 1; i < 20; i++){
			if (i % 2 == 0) {
				totalEven = totalEven + i;
			}
			else {
				totalOdd = totalOdd + i;
			}
		} 
		System.out.println("totalEven: " + totalEven);
		System.out.println("totalOdd: " + totalOdd);
	}
}
	