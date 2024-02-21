package org.zaza.eulerAlgorithmJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MigratoryBirds {
	
    public static int migratoryBirds(List<Integer> arr) {
    	Collections.sort(arr);
//    	System.out.println(arr.toString());
    	int numberWithHighestFrequency = 0;
    	int highestFrequency = 0;
    	int frequency = 0;
    	
    	for (int i = 0; i < arr.size() - 1; i++) {
    		int temp = arr.get(i);
//    		System.out.println("i: " + temp + " dan nextnya: " + arr.get(i + 1));
			frequency++;
//    		System.out.println("frekuensi dari " + temp + ": " + frequency);
    		if (temp != arr.get(i + 1)) {
    			if (highestFrequency < frequency) {
        			highestFrequency = frequency;
        			numberWithHighestFrequency = temp;
    			}
    			frequency = 0;
    		}
//        	System.out.println("highest frequency: " + highestFrequency);
//    		System.out.println("----------------------------------");
    	}
    	
		if (arr.get(arr.size() - 1) == arr.get(arr.size() - 2)) {
			frequency++;
			if (highestFrequency < frequency) {
    			highestFrequency = frequency;
    			numberWithHighestFrequency = arr.get(arr.size() - 1);
			}
		}

//		System.out.println("frekuensi tertinggi: " + highestFrequency);
//		System.out.println("angka dengan frekuensi tertinggi: " + numberWithHighestFrequency);
    	return numberWithHighestFrequency;
    }

	public static void main(String[] args) {
		List<Integer> typesOfBird = Arrays.asList(1, 6, 6, 6, 3, 3, 3);
//		Collections.sort(typesOfBird);
//		System.out.println(typesOfBird.toString());
		System.out.println(migratoryBirds(typesOfBird));
//		migratoryBirds(typesOfBird);
//		System.out.println(typesOfBird.get(typesOfBird.size()-1));
//		System.out.println(typesOfBird.get(typesOfBird.size()-2));
	}

}
