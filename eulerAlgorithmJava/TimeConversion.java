package org.zaza.eulerAlgorithmJava;
import java.io.*;
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

public class TimeConversion {
    public static String timeConversion(String s) throws ParseException {
    	String convertedTime = null;
    	SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss a");
    	Date date = sdf1.parse(s);
    	
    	SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
    	convertedTime = sdf2.format(date);
    	return convertedTime;
    }

	public static void main(String[] args) throws ParseException {
		System.out.println(timeConversion("07:05:45 PM"));
//		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
//	    String date = sdf.format(new Date()); 
//	    System.out.println(date);
	}

}
