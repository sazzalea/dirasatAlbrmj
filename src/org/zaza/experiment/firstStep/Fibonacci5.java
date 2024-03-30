public class Fibonacci5 {
	
	public static void main (String []arg) {
		try {
			int p = Integer.parseInt(arg[0]);
			int bilbul1 = 0;
			int bilbul2 = 1;
			System.out.println(bilbul1 + "; " + bilbul2 + "; ");
			int temp = 0;
			for (int i = 2; i < p ; i++) {
				temp = bilbul1 + bilbul2;
				bilbul1 = bilbul2;
				bilbul2 = temp;
				System.out.println(i + ": " + temp + "; ");
			}
			// System.out.print(temp);
		}
		catch (Exception e) {
			System.out.println ("Masukkan jumlah bilangan yang anda inginkan!");
		}
	}
}