package org.zaza.experiment;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WithFinally {

	public static void main(String[] args) {

		String log = "Test";
		DateFormat df = null;
		Date date = null;
		try (FileWriter writer = new FileWriter ("C:\\Users\\Zaza\\Documents\\experiment\\Java\\project1\\src\\org\\zaza\\experiment\\aplikasi_pesantren.log", true)) {
			df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			date = new Date();
			writer.write(df.format(date) + " " + log + "\n");
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}

/*
		String log = "Test";
		FileWriter writer = null;
		DateFormat df = null;
		Date date = null;
		try {
			df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			date = new Date();
			writer = new FileWriter ("aplikasi_pesantren.log", true);
			writer.write(df.format(date) + " " + log + "\n");
		}
		catch (IOException e){
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
			}
			catch (IOException e) {
				//silent exception
			} 
		}
	}

 */
