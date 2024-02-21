package org.zaza.experiment.learnOOP4;

abstract public class Kendaraan {
	
	private String merk;
	
	private boolean bermotor;
	
	public Kendaraan() {}
	
	public Kendaraan(String merk, boolean bermotor) {
		this.merk = merk;
		this.bermotor = bermotor;
	}
	
	abstract public void parkir(); 

	public String getMerk() {
		return this.merk;
	}
	
	public void setMerk(String merek) {
		this.merk = merek;
	}
	
	public boolean isBermotor() {
		return this.bermotor;
	}

}
