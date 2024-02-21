package org.zaza.experiment.learnOOP4;

public class Motor extends Kendaraan implements Bermotor, PelindungKepala{

	public Motor() {}
	
	public Motor(String merk, boolean bermotor) {
		super(merk, bermotor);
	}
	
	public void parkir() {
		System.out.println("Matikan mesin; Tegakkan standar; Kunci Setang");
	}
	
	public void knalpot() {
		System.out.println("Knalpot bising");
	}
	
	public void isiBensin() {
		System.out.println("Bensin sebagai bahan bakar motor");
	}
	
	public void wajibHelm() {
		System.out.println("Pengguna motor wajib menggunakan helm");
	}
	
}
