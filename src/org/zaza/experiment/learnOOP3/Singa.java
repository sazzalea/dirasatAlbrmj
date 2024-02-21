package org.zaza.experiment.learnOOP3;

public class Singa extends Hewan {

	public Singa() {}
	
	public Singa(String nama, boolean buas) {
		super(nama, buas);
	}
	
	public void bersuara() {
		System.out.println("Singa mengaum");
	}
	
	public void surai() {
		System.out.println("Singa jantan pasti punya surai");
	}

}
