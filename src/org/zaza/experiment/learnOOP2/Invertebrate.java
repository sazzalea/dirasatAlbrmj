package org.zaza.experiment.learnOOP2;

import org.zaza.experiment.learnOOP.Animal;

public class Invertebrate extends Animal {
	
	public Invertebrate() {
		System.out.println("constructing invertebrate");
	}
	
	public void move() {
		super.move();
		System.out.println("moving body");
	}

}
