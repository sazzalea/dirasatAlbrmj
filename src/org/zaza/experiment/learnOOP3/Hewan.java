package org.zaza.experiment.learnOOP3;

abstract public class Hewan implements Comparable<Hewan> {
	
	//conceptually, class contains attributes and behavior.
	//in Java, attributes/states are implemented by using fields member
	//and behaviors are implemented by using methods/functions
	
	//conceptually, we can create/instantiate object from a class
	//in Java, we use "new" keyword
	
	
	//so, definition of a Java class consist of its members, which grouped into:
	//- fields: attributes implementation
	//- methods: behavior implementation
	
	
	//1. list of fields/states/attributes/properties, that implement the concept of class attributes in Java

	//1. a. list of object fields, which means: only applicable in object created from this class
	
	private String name;
	
	private boolean buas; 
	
	public int weight;
	
	public int height;
	
	//1. b. list of class fields, which means only applicable for the class
	//PAY ATTENTION to "static" keyword
	public static String namaKelas = "Hewan"; 
	
	
	//2. list of methods/functions, that implement the concept class behavior in Java
	//here are constructors
	public Hewan() {}

	public Hewan(String name, boolean buas) {
		this.name = name;
		this.buas = buas;
	}
	
	abstract public void bersuara();
	
	//2. a. list of objects' methods/functions, which means: only applicable in object created from this class
	//for example: Hewan hewansatu = new Hewan(); 
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isBuas() {
		return buas;
	}
	
	public String toString() {
		return "Namanya adalah: " + this.name;
	}
	
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Hewan)) {
			return false;
		}
		Hewan hewan = (Hewan)obj;
		if (hewan.getName().equals(this.getName()) && hewan.isBuas() == this.isBuas()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(Hewan other) {
		return this.getName().compareTo(other.getName());
	}
	
	//1. b. list of class methods/functions, which means only applicable for the class
	
	public static String getNamaKelas() {
		return namaKelas;
	}
	
}
