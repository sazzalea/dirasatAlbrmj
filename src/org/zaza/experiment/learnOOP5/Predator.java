package org.zaza.experiment.learnOOP5;

public class Predator {
	//attributenya objek
	public String name;
	
	public double height;
	
	public int weight;
	
	//atributnya kelas
	public static String jenisHewan = "pemangsa";
	
	public static String gerakan = "melesat";
	
	//constructor
	public Predator() {}
	
	public Predator(String name, double tinggi, int berat) {
		this.name = name;
		this.height = tinggi;
		this.weight = berat;
	}
	
	//behaviournya objek
	public void menerkam() {
		System.out.println(name + " adalah predator hewan yang buas");
	}
	
	public String caraBergerak() {
		return "Hewan ini bergerak dengan " + gerakan;
	}

	//behaviournya class
	public static void ciriPredator() {
		System.out.println("Punya caranya sendiri untuk menangkap mangsa");
	}
	
	public static String penjelasanHewan() {
		return "Jenisnya " + jenisHewan;
	}

}
