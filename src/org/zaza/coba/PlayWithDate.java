package org.zaza.coba;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PlayWithDate {

	public static void main(String[] args) throws ParseException {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss ");
//	    String date = sdf.format(new Date()); 
//	    System.out.println(date);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//		String dateInString = "31-08-1982 10:20:56";
//	    Date date = sdf.parse(dateInString);
//	    System.out.println(date);
		
//		Calendar calendar = Calendar.getInstance();
//	    Date date =  calendar.getTime();
//	    System.out.println(date);

//	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
//	    Calendar calendar = new GregorianCalendar(2013,0,31);
//	    System.out.println(sdf.format(calendar.getTime()));

//		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");	
//		    Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
//
//		    int year       = calendar.get(Calendar.YEAR);
//		    int month      = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
//		    int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); 
//		    int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
//		    int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
//		    int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);
//
//		    int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
//		    int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
//		    int minute     = calendar.get(Calendar.MINUTE);
//		    int second     = calendar.get(Calendar.SECOND);
//		    int millisecond= calendar.get(Calendar.MILLISECOND);
//		        
//		    System.out.println(sdf.format(calendar.getTime()));
//		        
//		    System.out.println("year \t\t: " + year);
//		    System.out.println("month \t\t: " + month);
//		    System.out.println("dayOfMonth \t: " + dayOfMonth);
//		    System.out.println("dayOfWeek \t: " + dayOfWeek);
//		    System.out.println("weekOfYear \t: " + weekOfYear);
//		    System.out.println("weekOfMonth \t: " + weekOfMonth);
//		        
//		    System.out.println("hour \t\t: " + hour);
//		    System.out.println("hourOfDay \t: " + hourOfDay);
//		    System.out.println("minute \t\t: " + minute);
//		    System.out.println("second \t\t: " + second);
//		    System.out.println("millisecond \t: " + millisecond);
		
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");	
	        
		    Calendar calendar = new GregorianCalendar(2013,10,28);	
		    System.out.println("Date : " + sdf.format(calendar.getTime()));

		    //add one month
		    calendar.add(Calendar.MONTH, 1);
		    System.out.println("Date : " + sdf.format(calendar.getTime()));
		        
		    //subtract 10 days
		    calendar.add(Calendar.DAY_OF_MONTH, -10);
		    System.out.println("Date : " + sdf.format(calendar.getTime()));
	}

}
