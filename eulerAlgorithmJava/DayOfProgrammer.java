package org.zaza.eulerAlgorithmJava;

public class DayOfProgrammer {
	
    public static String dayOfProgrammer(int year) {
       	if (year >= 1700 && year <= 1917) {
       		if (year % 4 == 0) {
           		System.out.println("Tahun " + year + " menggunakan sistem kalender Julian dan merupakan tahun kabisat");
       			return "12.09." + year;
       		}
       		else {
       			System.out.println("Tahun " + year + " menggunakan sistem kalender Julian");
       			return "13.09." + year;      			
       		}
       	}
       	else if (year == 1918) {
       		System.out.println("Tahun " + year + " adalah transisi dari Julian Calendar ke Gregorian Calendar");
       		return "27.09.1918";
       	}
       	 
       	else if (year >= 1918 && year <= 2700) {
       		if (year % 4 == 0) {
           		System.out.println("Tahun " + year + " menggunakan sistem kalender Gregorian dan merupakan tahun kabisat");
       			return "12.09." + year;      			
       		}
       		else {
       			System.out.println("Tahun " + year + " menggunakan sistem kalender Gregorian");
       			return "13.09." + year;      			
       		}
       	}
       	
       	return "";
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dayOfProgrammer(1767));
		System.out.println(dayOfProgrammer(1918));
		System.out.println(dayOfProgrammer(2100));
	}

}
