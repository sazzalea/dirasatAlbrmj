package org.zaza.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyListIterator1 {
	
	public static void main(String[] args) {
		List<String> lstString = new ArrayList<>();
		
		lstString.add("Putih");
		lstString.add("Kiky");
		lstString.add("Kara");
		lstString.add("Coreng");
		lstString.add("Moka");
		
		Iterator<String> iterator1 = lstString.iterator();
		while (iterator1.hasNext()) {
			String value = iterator1.next();
			System.out.println(value);
		}
		System.out.println("====================");
		for (String s: lstString) {
			System.out.println(s);
		}
		System.out.println("====================");
		for (int i = 0; i < lstString.size(); i++) {
			System.out.println(lstString.get(i));
		}
	}

}
