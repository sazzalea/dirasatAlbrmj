public class Recursive3 {
	
	public static int akumulasiLoop(int n) {
		int total = 0;
		for (int i = n; i >= 0; i--) {
			total += i;
		}
		return total;
	}

/*
akumulasiRekursi(0) = 0 //0 -- BASE CASE
akumulasiRekursi(1) = 1 + akumulasiRekursi(0) = 1  //0 + 1
akumulasiRekursi(2) = 2 + akumulasiRekursi(1) = 3  //0 + 1 + 2
akumulasiRekursi(3) = 3 + akumulasiRekursi(2) = 6  //0 + 1 + 2 + 3
akumulasiRekursi(4) = 4 + akumulasiRekursi(3) = 10 //0 + 1 + 2 + 3 + 4

//DARI ATAS
main...
    akumulasiRekursi(4) = 4 + akumulasiRekursi(3) = 10 //0 + 1 + 2 + 3 + 4
        akumulasiRekursi(3) = 3 + akumulasiRekursi(2) = 6  //0 + 1 + 2 + 3
            akumulasiRekursi(2) = 2 + akumulasiRekursi(1) = 3  //0 + 1 + 2
                akumulasiRekursi(1) = 1 + akumulasiRekursi(0) = 1  //0 + 1
                    akumulasiRekursi(0) = 0 //0 -- BASE CASE
		            return 0  //ketika n = 0
         		return 1      //ketika n = 1
	        return 3          //ketika n = 2
	    return 6              //ketika n = 3
    return 10                 //ketika n = 4
main
	
*/
	
	public static int akumulasiRekursi(int n) {
		if (n == 0) {
			System.out.println("base case, n = " + n);
			return 0;
		}
		else {
			int total = n + akumulasiRekursi(n-1);
			System.out.println("n = " + n + ", total: " + total);
			return total;
			// return n + akumulasiRekursi(n-1);
		}
	}
	
	public static void main(String[] arg) {
		System.out.println("akumulasiLoop: " + akumulasiLoop(4));
		System.out.println("akumulasiRekursi: " + akumulasiRekursi(4));
	}
}