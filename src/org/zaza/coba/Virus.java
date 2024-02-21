package org.zaza.coba;

public class Virus {
	private String name;
	
	private String tipe;
	
//	private Virus () {}
	
	public Virus(String name, String tipe) {
		this.name = name;
		this.tipe = tipe;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String nama) {
		this.name = nama;
	}

	public String getType() {
		return this.tipe;
	}

	public void setType(String type) {
		this.tipe = type;
	}

}
