/* Pemrograman rekursif: fungsi yg memanggil diri sendiri.

cetakAngkaRekursi(4);
  cetakAngkaRekursi(3);
    cetakAngkaRekursi(2);
      cetakAngkaRekursi(1);
	    cetakAngkaRekursi(0);
		return //dari 0
	  return //dari 1
       

*/


public class Recursive1 {
	
	public static void cetakAngka(int n) {
		for (int i = n; i > 0; i--) {
			System.out.println(i + ". loop");
		}
		System.out.println("selesai mencetak");
		return;
	}
	
	public static void cetakAngkaRekursi(int n) {
		if (n == 0) {  //base case
			System.out.println("selesai mencetak dengan rekursi");
			return;
		}
		else {  //recursive case
			System.out.println(n + ". rek");
			cetakAngkaRekursi(n - 1);
			return;
		}
	}
	
	public static void main(String[] arg) {
		int p = 0;
		cetakAngka(4);
		System.out.println("==========");
		cetakAngkaRekursi(3);
		System.out.println("----------");
	}	

/* 
//rekursif
main:41
  cetakAngkaRekursi      :25  //ketika n = 3
  cetakAngkaRekursi      :32  //ketika n = 3  
    cetakAngkaRekursi    :25  //ketika n = 2
    cetakAngkaRekursi    :32  //ketika n = 2
      cetakAngkaRekursi  :25  //ketika n = 1
      cetakAngkaRekursi  :32  //ketika n = 1
        cetakAngkaRekursi:25  //ketika n = 0
		return                //ketika n = 0
	  cetakAngkaRekursi  :33  //ketika n = 1
	  return
    cetakAngkaRekursi    :33  //ketika n = 2
	return
  cetakAngkaRekursi      :33  //ketika n = 3
  return
main:42

two parts in a recursive function:
- base part
- recursive part


//loop
main:39
  cetakAngka(4)   :17
  ...
  return
main:40


*/	
	

}