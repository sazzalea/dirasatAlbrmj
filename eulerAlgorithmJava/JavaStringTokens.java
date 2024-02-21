package org.zaza.eulerAlgorithmJava;

public class JavaStringTokens {
	
	public static void main(String[] arg) {
		String s = "          YES      leading spaces        are valid,    problemsetters are         evillllll";
		s = s.trim();
		if (s.length() == 0) {
			System.out.println(0);
		}
		else {
			String[] splited = s.split("[ ,'!?._@]+");
			System.out.println(splited.length);
			for (int i = 0; i < splited.length; i++) {
				System.out.println(splited[i]);
			}
		}
	}
}
