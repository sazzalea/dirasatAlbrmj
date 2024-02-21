package org.zaza.experiment.learnOOP;

public class Vertebrate extends Animal {
	
	public Vertebrate() {
		System.out.println("constructing vertebrate");
	}

	public void move() {
		super.move();
		System.out.println("move the limb");
	}
	
}
