package org.zaza.coba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sortir {

	public static void main(String[] args) {
		List<Integer> lstInt = new ArrayList<>();
//		List<String> lstString = new ArrayList<>();
		int[] array = {(int)(Math.random() * 100), (int)(Math.random() * 100), (int)(Math.random() * 100), (int)(Math.random() * 100), (int)(Math.random() * 100)};
		String[] namaKucing = {"Kara", "Coreng", "Moka"};
		
		lstInt.add((int)(Math.random() * 100));
		lstInt.add((int)(Math.random() * 100));
		lstInt.add((int)(Math.random() * 100));
		lstInt.add((int)(Math.random() * 100));
		lstInt.add((int)(Math.random() * 100));
		System.out.println(lstInt.toString());
//		lstInt.sort();
		
//		for (int i: array) {
//			System.out.print(i + " ");
//		}
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
//		for (String s: namaKucing) {
//			System.out.print(s + "; ");
//		}
		System.out.println(Arrays.toString(namaKucing));
		Arrays.sort(namaKucing);
		System.out.println(Arrays.toString(namaKucing));
	}

}
