package org.zaza.Cpro;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Yang belum diisi
		int[] arr = new int[10];
		System.out.println("Panjang array " + arr.length);
		for (int i = 0; i < arr.length; i++) {
//			cara mengisi
			arr[i] = i;
//			untuk menampilkan isi array
			System.out.println("Elemen array ke " + i + " adalah " + i);
		}
		
//		Yang langsung diisi
		int[] marks = {70, 77, 87, 98, 75, 90};
	}

}
