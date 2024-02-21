package org.zaza.eulerDataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
    	List<Integer> matchWordsCount = new ArrayList<>();
    	for (int i = 0; i < queries.size(); i++) {
        	int matchCounter = 0;
    		String yangDicari = queries.get(i);
//    		System.out.println(yangDicari);
    		for (int j = 0; j < strings.size(); j++) {
    			String yangDiDalamKamus = strings.get(j);
//    			System.out.println("-> " + yangDiDalamKamus);
    			if (yangDicari.equals(yangDiDalamKamus)) {
    				matchCounter++;
//    				System.out.println("--> " + matchCounter + " match");
    			}
    		}
    		matchWordsCount.add(matchCounter);
    	}
    	return matchWordsCount;
    }

    public static List<Integer> matchingStrings2(List<String> strings, List<String> queries) {
    	List<Integer> matchWordsCount = new ArrayList<>();
    	for (int i = 0; i < queries.size(); i++) {
        	int matchCounter = 0;
    		String yangDicari = queries.get(i);
    		matchCounter = Collections.frequency(strings, yangDicari);
    		matchWordsCount.add(matchCounter);
    	}
    	return matchWordsCount;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> input = Arrays.asList("aba", "baba", "aba", "xzxb");
		List<String> queries = Arrays.asList("aba", "xzxb", "ab");
		System.out.println(matchingStrings2(input, queries));
	}

}
