package org.zaza.experiment.learnOOP4;

public class Mobil extends Kendaraan implements Bermotor {

	public Mobil() {}
	
	public Mobil(String merk, boolean bermotor) {
		super(merk, bermotor);
	}
	
	public void parkir() {
		System.out.println("Matikan mesin; Tutup jendela; Kunci mobil");
	}
	
	public void penumpang() {
		System.out.println("Bisa menampung banyak penumpang");
	}
	
	public void isiBensin() {
		System.out.println("Bensin sabagai bahan bakar mobil");
	}

}
