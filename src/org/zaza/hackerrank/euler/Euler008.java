package org.zaza.hackerrank.eulerNgulang;

public class Euler008 {
	
	public static int getProduct(String angkaYangSudahDipecah) {
		int result = 1;
		for (int i = 0; i < angkaYangSudahDipecah.length(); i++) {
			char tmp = angkaYangSudahDipecah.charAt(i);
			int convertedChar = Character.getNumericValue(tmp);
			result *= convertedChar;
		}
		return result;
	}
	
	public static int getLargestProduct(String angka, int batas) {
		int largestProduct = 0;
		for (int i = 0; i <= angka.length() - batas; i++) {
			String temp = angka.substring(i, batas + i);
//			System.out.println(temp);
			int product = getProduct(temp);
//			System.out.println("--> " + getProduct(temp));
			if (product > largestProduct) {
				largestProduct = product;
			}
		}
		return largestProduct;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLargestProduct("3675356291", 5));
	}

}
