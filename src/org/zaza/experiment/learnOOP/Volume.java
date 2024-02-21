package org.zaza.experiment.learnOOP;

public class Volume {
	
	private int sisi;
	
	public Volume(int ln) {
		sisi = ln;
	}
	
	public double ballVolume() {
		double angka = (double) 4/3;
		return angka * Math.pow(sisi, 3) * Math.PI;
	}
	
	public double cubicVolume() {
		return Math.pow(sisi, 3);
	}

}
