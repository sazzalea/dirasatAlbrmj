package org.zaza.eulerAlgorithmJava;
import java.math.BigDecimal;
import java.util.*;

public class BigDecimalExercise {
    public static void main(String []args){
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
//        BigDecimalComparator dc1 = new BigDecimalComparator();
    	Comparator<String> dc2 = ( String first, String second) -> {
    		if (first == null || second == null) {
    			return 0;
    		}
    		BigDecimal num1 = new BigDecimal(first);
    		BigDecimal num2 = new BigDecimal(second);
        	return num2.compareTo(num1);
        };
//        Arrays.sort(s, dc1);
        Arrays.sort(s, dc2);
        //Output
        for (int i = 0; i < n; i++)
        {
            System.out.println(s[i]);
        }
    }
}
