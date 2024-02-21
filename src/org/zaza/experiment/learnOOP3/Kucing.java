package org.zaza.experiment.learnOOP3;

public class Kucing extends Hewan implements Peliharaan {
	
	public Kucing() {}
	
	public Kucing(String name, boolean buas) {
		super(name, buas);
	}
	
	public void bersuara() {
		System.out.println("Kucing mengeong");
	}
	
	public void cakar() {
		System.out.println("Kucing punya cakar");
	}
	
	public void mainDenganAnak() {
		System.out.println("Kucing menemani anak");
	}
	
	public void dimandikan() {
		System.out.println("Kucing dimandikan");
	}

	public static void kucingItuKonsep() {
		System.out.println("Kucing itu konsep");
	}
}
