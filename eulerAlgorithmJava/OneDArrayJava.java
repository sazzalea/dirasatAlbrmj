package org.zaza.eulerAlgorithmJava;
import java.util.*;

public class OneDArrayJava {
    public static void main(String[] args) {
 	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            int angkaDalamArray = scan.nextInt();
            a[i] = angkaDalamArray;
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
//        	a[i] = angkaDalamArray;
            System.out.println(a[i]);
        }
    }
}
