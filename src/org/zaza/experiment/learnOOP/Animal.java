package org.zaza.experiment.learnOOP;

public class Animal {
	
	public Animal() {
		System.out.println("constructing animal");
	}

	protected void move() {
		System.out.println("Animal is moving");
	} 
	
	public void breath() {
		System.out.println("Animal is breathing");
	}
	
}
