package org.zaza.eulerAlgorithmJava;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
import java.util.Scanner;

public class SubstringComparison {
	
	private static java.util.List<String> listString = new java.util.ArrayList<>();
	
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for (int i = 0; i <= s.length() - k; i++) {
            String temp = s.substring(i, k + i);
            listString.add(temp);
        }
		java.util.Comparator<String> sc = (String first, String second) -> {
			return first.compareTo(second);
		};
//        System.out.println(listString.toString());
		listString.sort(sc);
//        listString.sort((String first, String second) -> first.compareTo(second));
//        System.out.println(listString.toString());
        smallest = listString.get(0);
        largest = listString.get(listString.size()-1);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

    public static String getSmallestAndLargest2(String s, int k) {
    	String smallest = "xxxxxxxxxxxxxxxxx";
    	String largest = "";
        for (int i = 0; i <= s.length() - k; i++) {
            String temp = s.substring(i, k + i);
            System.out.println(temp);
            if (temp.compareTo(largest) > 0) {
            	largest = temp;
            }
            if (temp.compareTo(smallest) < 0) {
            	smallest = temp;
            }
        }
        System.out.println();
    	
    	return smallest + "\n" + largest;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest2(s, k));
    }

}
