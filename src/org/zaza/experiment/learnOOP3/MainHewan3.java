package org.zaza.experiment.learnOOP3;

import java.util.Arrays;
import java.util.Comparator;

public class MainHewan3 {

	public static void main(String[] args) {
//		Cara tradisional masukin array	
//		Kucing[] kucings = new Kucing[5];
//		Kucing kucing1 = new Kucing("Putih", false);
//		kucings[0] = kucing1;
//		System.out.println(kucings[0]);
		
		Kucing[] kucingRumah = {new Kucing("Putih", false), new Kucing("Kiky", false),
								new Kucing("Kara", false), new Kucing("Coreng", false),
								new Kucing("Moka", false)};
		
//		for (Kucing k: kucingRumah) {
//			System.out.println(k);
//		}
		
		System.out.println("--Urutan asli--");
		System.out.println(Arrays.toString(kucingRumah));
		System.out.println("--Urutan berdasarkan comparable--");
		Arrays.sort(kucingRumah);
		System.out.println(Arrays.toString(kucingRumah));
		

		System.out.println("--Urutan berdasarkan comparator--");
		HewanComparator hc1 = new HewanComparator(true);
		Comparator<Hewan> hc2 = (Hewan first, Hewan second) -> {
			return first.getName().length() - second.getName().length();
		};
//		Arrays.sort(kucingRumah, hc1);
		Arrays.sort(kucingRumah, hc2);
		System.out.println(Arrays.toString(kucingRumah));
		
	}

}
