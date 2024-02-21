package org.zaza.eulerAlgorithmJava;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagram {
	
    static boolean isAnagram(String str1, String str2) {
    	if (str1.length() != str2.length() || str1.length() == 0) {
    		return false;
    	}
    	boolean result = true;
    	str1 = str1.toLowerCase();
    	str2 = str2.toLowerCase();	
    	int counter = 0;
    	for (char c = 'a'; c <= 'z'; c++) {
    		for (int i = 0; i < str1.length(); i++) {
    			if (str1.charAt(i) == c) {
    				counter++; 
    			}
    			if (str2.charAt(i) == c) {
    				counter--;
    			} 
    		}
    		if (counter != 0) {
    			result = false;
    			break;
    		}
    	}
    	return result;
    }
    
    public static boolean isAnagram2(String str1, String str2) {
    	HashMap<Character, Integer> anagram = new HashMap();
    	boolean result = true;
    	str1 = str1.toLowerCase();
    	str2 = str2.toLowerCase();	
    	for (int i = 0; i < str1.length(); i++) {
    		char tmp = str1.charAt(i);
    		if (!anagram.containsKey(tmp)) {
    			anagram.put(tmp, 1);
    		}
    		else {
    			int val = anagram.get(tmp);
    			anagram.put(tmp, ++val);
    		}
    	}
    	for (int j = 0; j < str2.length(); j++) {
    		char tmp = str2.charAt(j);
    		if (!anagram.containsKey(tmp)) {
    			result = false;
    			break;
    		}
    		else {
    			int val = anagram.get(tmp);
    			anagram.put(tmp, --val);
    		}
    	}
//    	System.out.println(anagram);
    	
    	for (Map.Entry<Character, Integer> keyValue : anagram.entrySet()) {
//    		System.out.println(keyValue.getKey() + ":" + keyValue.getValue());
    		if (keyValue.getValue() != 0) {
    			result = false;
    			break;
    		}
    	}
    	return result;
    }

  public static void main(String[] args) {
    
//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
//        boolean ret = isAnagram(a, b);
//        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	  System.out.println(isAnagram2("Zaza", "zazaz") ? "Anagrams" : "Not Anagrams");
	  System.out.println(isAnagram2("Zaza", "Nana") ? "Anagrams" : "Not Anagrams");
    }

}
