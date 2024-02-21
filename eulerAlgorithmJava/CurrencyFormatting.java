package org.zaza.eulerAlgorithmJava;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
//        Locale locale = new Locale("en", "US");
        NumberFormat formatterUS = NumberFormat.getCurrencyInstance(Locale.US);
//        NumberFormat formatterUS = NumberFormat.getCurrencyInstance(locale);
//        System.out.println(formatterUS.format(payment));
        String us = formatterUS.format(payment);
        
        
        NumberFormat formatterIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = formatterIndia.format(payment);
        
        NumberFormat formatterChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = formatterChina.format(payment);
        
        NumberFormat formatterFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = formatterFrance.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
