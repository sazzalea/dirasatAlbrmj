public class Recursive2 {
	
	public static void cetakAngkaRekursi(int n) {
		if (n == 0) {
			// System.out.println("sudah selesai dengan rekursi");   
			return;
		}
		else {
			System.out.println(n);
			cetakAngkaRekursi(n - 1);
			return;
		}
	}
	
	public static void cetakAngkaLoop(int n) {
		int i = n;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
	}
	
	public static void main(String[] arg) {
		cetakAngkaRekursi(10);
		System.out.println("======================");
		cetakAngkaLoop(10);
	} 
}