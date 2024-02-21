package org.zaza.hackerrank.algorithmNgulang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
	
    public static String timeConversion(String s) throws ParseException {
    	String formattedTime = "";
    	
    	SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");
    	Date date = formatter.parse(s);
    	
    	SimpleDateFormat newFormatter = new SimpleDateFormat("HH:mm:ss");
    	formattedTime = newFormatter.format(date);
    	
    	return formattedTime;
    }

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println(timeConversion("07:05:45 PM"));

	}

}
