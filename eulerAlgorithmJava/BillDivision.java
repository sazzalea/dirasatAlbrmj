package org.zaza.eulerAlgorithmJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillDivision {
	
	
//	k: item yang ga anna makan
//	b: billnya anna 
    public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here
    	int billAnnaSebenarnya = 0;
    	for (int i = 0; i < bill.size(); i++) {
    		billAnnaSebenarnya += bill.get(i);
    	}
    	
		billAnnaSebenarnya = (billAnnaSebenarnya - bill.get(k))/2;
    	
		if (billAnnaSebenarnya == b) {
    		System.out.println("Bon Appetit");
    	}
    	else {
    		System.out.println(b - billAnnaSebenarnya);
    	}
//    	System.out.println("Biil Anna yang sebenarnya" + billAnnaSebenarnya);
    }
	public static void main(String[] arg) {
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Jumlah makanan: ");
//		int jmlMakanan = input.nextInt();
//		
//		System.out.print("Item yang tidak Anna makan: ");
//		int itemAnna = input.nextInt();
//		
////		System.out.print("Masukkan harga-harga item: ");
////		List<Integer> harga = new ArrayList<>();
////		for(int i = 0; i < jmlMakanan; i++) {
////			int hargaItem = input.nextInt();
////			harga.add(hargaItem);
////		}
//		
//		System.out.print("Billnya Anna yang dikasih Brian: ");
//		int billAnna = input.nextInt();
		
		List<Integer> harga = new ArrayList<>();
		harga.add(3);
		harga.add(10);
		harga.add(2);
		harga.add(9);
		
		bonAppetit(harga, 1, 7);
	}

}
