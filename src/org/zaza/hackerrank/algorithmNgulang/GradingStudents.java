package org.zaza.hackerrank.algorithmNgulang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
	
    public static List<Integer> gradingStudents(List<Integer> grades) {
    	List<Integer> fixGrades = new ArrayList<>();
    	for (int i = 0; i < grades.size(); i++) {
    		int temp = grades.get(i);
    		if (temp >= 38 && temp % 5 >= 3) {
    			temp -= (temp % 5);
    			temp += 5;
    		}
    		fixGrades.add(temp);
    	}
    	return fixGrades;
    }
    
    public static void main(String[] arg) {
    	List<Integer> grades = Arrays.asList(73, 67, 38, 33);
    	System.out.println(gradingStudents(grades));
    }

}
