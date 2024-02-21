package org.zaza.alpro;

public class Bab3Nomor16 {

	public static void main(String[] args) {
		double width = 100;
		double height = 100;
		
		double coordinateWidth = Math.random() * 100;
		double coordinateHeight = Math.random() * 100;
		
		if (coordinateWidth >= width && coordinateHeight >= height) {
			System.out.println("Koordinat melebihi batas yang telah ditentukan");
		}
		
		else {
			System.out.println("Titik koordinat: " + coordinateWidth + ", " + coordinateHeight);
		}
	}

}
