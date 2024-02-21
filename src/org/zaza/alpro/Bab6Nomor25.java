package org.zaza.alpro;

public class Bab6Nomor25 {
	
	public static String convertMillis(long millis) {
		long second = millis / 1000;
		long minute = second / 60;
		long sisaDetik = second - (minute * 60);
		long hour = minute / 60;
		long sisaMenit = minute - (hour * 60);
//		System.out.println("convert ms to s, with ms = " + millis + " to s = " + second);
//		System.out.println("convert s to m, with s = " + second + " to m = " + minute + " and " + sisaDetik + " s");
//		System.out.println("convert m to h, with m = " + minute + " to h = " + hour + " and " + sisaMenit + " m");
		
		String hourFix = Long.toString(hour);
		String minuteFix = Long.toString(sisaMenit);
		String secondFix = Long.toString(sisaDetik);

		return hourFix + " : " + minuteFix + " : " + secondFix;
	}

	public static void main(String[] args) {
		System.out.println(convertMillis(5500));;
		System.out.println(convertMillis(100000));;
		System.out.println(convertMillis(555550000));;
	}

}
