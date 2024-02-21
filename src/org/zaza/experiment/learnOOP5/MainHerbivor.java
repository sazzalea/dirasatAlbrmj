package org.zaza.experiment.learnOOP5;

public class MainHerbivor {

	public static void main(String[] args) {
//		Jerapah jerapahUtara = new Jerapah("Jerapah Utara", "daun di pucuk pohon", 4.6, 550);
		Jerapah jerapahUtara = new Jerapah();
//	Line 10-14 itu mengeset nilai-nilai atribut objek
		jerapahUtara.name = "Melman";
		jerapahUtara.jenisMakanan = "daun pucuk"; 
		jerapahUtara.height = 4.6;
		jerapahUtara.weight = 550;
		jerapahUtara.dataHewan();
		jerapahUtara.tidakMenyeramkan();
		System.out.println("Jenis makanan: " + jerapahUtara.jenisMakanan);
		System.out.println(Jerapah.explanation());
		System.out.println(jerapahUtara.penjelasanLebihLanjut());
		
	}

}
