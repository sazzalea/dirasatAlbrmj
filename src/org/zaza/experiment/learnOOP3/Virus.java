//kelas immutable

package org.zaza.experiment.learnOOP3;

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

	public String getType() {
		return this.tipe;
	}
	
	public String toString() {
		return this.name + "---" + this.tipe;
	}
	

}
