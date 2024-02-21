package org.zaza.experiment.learnOOP3;

public class Anjing extends Hewan implements Peliharaan{
	
	public Anjing() {}
	
	public Anjing(String name, boolean buas) {
		super(name, buas);
	}
	
	public void bersuara() {
		System.out.println("Anjing menggonggong");
	}
	
	public void rahang() {
		System.out.println("Anjing punya rahang kuat");
	}

	public void mainDenganAnak() {
		System.out.println("Anjing menemani anak");
	}
	
	public void dimandikan() {
		System.out.println("Anjing dimandikan");
	}
	
}
