public class Recursive5 {

	public static int akumulasiRekursi(int n) {
		if (n == 0) {
			return n;
		} 	
		else {
			return n + akumulasiRekursi(n - 1); 
		}
	}
	
	public static int faktorialRekursi(int n) {
		if (n <= 1) {
			return 1;
		}
		else {
			return n * faktorialRekursi(n - 1);
		}
	}

	public static void main(String[] arg) {
		System.out.println("akumulasiRekursi: " + akumulasiRekursi(4));
		System.out.println("=========================");
		System.out.println("faktorialRekursi: " + faktorialRekursi(4));
	}
}