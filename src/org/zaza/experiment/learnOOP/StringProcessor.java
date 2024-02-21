package org.zaza.experiment.learnOOP;

public class StringProcessor {
	
	private String word;
	
	public StringProcessor(String term) {
		word = term;
	}

	public String upperCase() {
		return word.toUpperCase();
	} 
	
	public String lowerCase() {
		return word.toLowerCase();
	}
	
	public String firstHalf() {
		return word.substring(0, word.length()/2);
	}
	
	public String lastHalf() {
		return word.substring(word.length()/2, word.length()-1);
	}
}
