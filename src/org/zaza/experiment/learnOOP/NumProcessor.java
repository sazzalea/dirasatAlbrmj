package org.zaza.experiment.learnOOP;

public class NumProcessor {

	private int angka;
	
	public NumProcessor (int ln) {
		angka = ln;
	}
	
	public double square() {
		return Math.pow(angka, 2);
	}
	
	public double cubic() {
		return Math.pow(angka, 3);
	}
	
	public double sqrt() {
		return Math.sqrt(angka);
	}
}
