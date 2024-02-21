package org.zaza.experiment.learnOOP5;

public class Jerapah {
	
	//list of object states/attributes
	public String name;
	
	public String jenisMakanan;
	
	public double height, weight;
	
	//list of class states/attributes
	public static String penjelasan = "Jerapah tidak akan makan daging";
	
	//constructor
//	public Jerapah() {}
//	
//	public Jerapah(String name, String makanan, double tinggi, double berat) {
//		this.name = name;
//		jenisMakanan = makanan;
//		height = tinggi;
//		berat = tinggi;
//	}
	
	//list of class' behaviour
	public static String explanation() {
		return penjelasan;
	}
	
	//list of object's behaviour
	public void dataHewan() {
		System.out.println(name + " makan " + jenisMakanan + ", tingginya " + height + " m, dan beratnya " + weight + " kg");
	}
	
	public void tidakMenyeramkan() {
		System.out.println("Tidak menyeramkan, asal tak diganggu");
	}
	
	public String penjelasanLebihLanjut() {
		return penjelasan + ", tapi tumbuhannya sendiri juga berbeda-beda";
	}
	
}
