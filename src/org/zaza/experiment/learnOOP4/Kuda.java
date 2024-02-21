package org.zaza.experiment.learnOOP4;

public class Kuda extends Kendaraan implements PelindungKepala, AutoCloseable {

	public Kuda() {}
	
	public Kuda(String merk, boolean bermotor) {
		super(merk, bermotor);
	}
	
	public void parkir() {
		System.out.println("Tambatkan di tiang menggunakan tali;");
	}
	
	public void berak() {
		System.out.println("Kuda berak");
	}
	
	public void wajibHelm() {
		System.out.println("Penunggang kuda wajib menggunakan helm");
	}

	public void close() throws Exception {
		System.out.println("Matiin kuda");
	}
	
}
