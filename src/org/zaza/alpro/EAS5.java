package org.zaza.alpro;

public class EAS5 {
	
	public static String format(int bilangan, int p) {
		String hasilAkhir = Integer.toString(bilangan);
		for (int i = 0; i <= (p - hasilAkhir.length()); i++) {
			hasilAkhir = "0" + hasilAkhir;
		}
		return hasilAkhir;
	}

	public static void main(String[] args) {
		System.out.println(format(34, 1));
	}

}
