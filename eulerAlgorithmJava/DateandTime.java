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

public class DateandTime {

	public static String findDay(int month, int day, int year) {
		String days = null;
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar(year, month-1, day);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		switch (dayOfWeek) {
		
		case 1:
			days = "SUNDAY";
			break;
			
		case 2:
			days = "MONDAY";
			break;
			
		case 3:
			days = "TUESDAY";
			break;
			
		case 4:
			days = "WEDNESDAY";
			break;
			
		case 5:
			days = "THURSDAY";
			break;
			
		case 6:
			days = "FRIDAY";
			break;
			
		case 7:
			days = "SATURDAY";
			break;
		
		}
//		System.out.println(sdf.format(calendar.getTime()));
//		System.out.println(dayOfWeek);
		return days;
    }
	
	public static void main(String[] arg) {
		System.out.println(findDay(8, 5, 2015));
	}

}
