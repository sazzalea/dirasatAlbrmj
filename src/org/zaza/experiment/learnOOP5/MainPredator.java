package org.zaza.experiment.learnOOP5;

public class MainPredator {

	public static void main(String[] args) {
		Predator elang = new Predator("Elang", 1, 20);
		elang.menerkam();
		Predator.ciriPredator();
		System.out.println(Predator.penjelasanHewan());
		System.out.println(elang.caraBergerak());
	}

}
