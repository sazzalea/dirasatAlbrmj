package org.zaza.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySetIterator {

	public static void main(String[] args) {
		Set<String> setString = new HashSet<>();
		setString.add("Putih");
		setString.add("Kiky");
		setString.add("Kara");
		setString.add("Coreng");
		setString.add("Moka");
		
		Iterator<String> iterator1 = setString.iterator();
		while(iterator1.hasNext()) {
			String nama = iterator1.next();
			System.out.println(nama);
		}
		System.out.println("=================");
		for (String s: setString) {
			System.out.println(s);
		}
	}

}
