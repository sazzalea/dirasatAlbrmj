package org.zaza.coba;

public class Coba {

	public static void ubahInt(int angka) {
		angka = 66;
	}

	public static void ubahIntClass(Integer angka) {
		angka = 66;
		
	}

	public static void ubahVirus(Virus virus) {
		virus.setName("cacar");	
	}
	
	public static void main(String[] args) {
//		int g = 9;
//		ubahInt(g);
//		System.out.println(g);

		Virus virus1 = new Virus("COVID 19", "Corona");
		System.out.println("nama sebelum diubah: " + virus1.getName());
		ubahVirus(virus1);
		System.out.println("nama setelah diubah: " + virus1.getName());
//		System.out.println("nama: " + virus1.getName());
	}
}
