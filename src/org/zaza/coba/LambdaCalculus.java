package org.zaza.coba;

import java.util.Arrays;
import java.util.Comparator;

class StringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length() - o2.length();
	}}

public class LambdaCalculus {

	public static void main(String[] args) {
		String[] kucingRumah = {"Putih", "Kiky", "Kara", "Coreng", "Moka"};
		StringComparator sc1 = new StringComparator();
		Comparator<String> sc2 = (String first, String second) -> {
			return first.length() - second.length();
		};
//		Arrays.sort(kucingRumah);
//		Arrays.sort(kucingRumah, sc1);
//		Arrays.sort(kucingRumah, sc2);
//		Arrays.sort(kucingRumah, (String first, String second) -> first.length() - second.length());
		Arrays.sort(kucingRumah, (first, second) -> first.length() - second.length());
		System.out.println(Arrays.toString(kucingRumah));
	}

}
