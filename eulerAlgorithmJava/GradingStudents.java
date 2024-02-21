package org.zaza.eulerAlgorithmJava;
//import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class GradingStudents {
	
    public static List<Integer> gradingStudents(List<Integer> grades) {
    	List<Integer> result = new ArrayList<>();
    	for (int i = 0; i < grades.size(); i++) {
    		int temp = grades.get(i);
    		if (temp >= 38 && temp % 5 >= 3) {
				temp -= (temp % 5);
				temp += 5;
    		}
    		result.add(temp);
    	}
    	return result;
    }

	public static void main(String[] args) {
		List<Integer> grades = Arrays.asList(73, 67, 38, 33);
		System.out.println(grades.toString());
		List<Integer> roundedGrades = gradingStudents(grades);
		System.out.println(roundedGrades.toString());
	}

}
