package org.zaza.experiment.learnOOP3;

public class Burung extends Hewan {
	
	public Burung() {}
	
	public Burung(String name, boolean buas) {
		super(name, buas);
	}
	
	public void bersuara() {
		System.out.println("Burung bercuit");
	}
	
	public void paruh() {
		System.out.println("Burung memiliki paruh");
	}

}
