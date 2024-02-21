package org.zaza.coba;
import java.util.HashMap;

public class MyHashMap {

	public static void main(String[] args) {
	    // Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
//	    capitalCities.clear();
	    capitalCities.put("USA", "New York");
	    capitalCities.remove("England");
	    System.out.println(capitalCities.containsKey("Jakarta") ? "ada Jakarta" : "tidak ada Jakarta");
	    System.out.println(capitalCities);
//	    System.out.println(capitalCities.get("England"));
	  }
}
