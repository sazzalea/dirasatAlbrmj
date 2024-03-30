import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class IO1 {
	
	public static void main(String[] arg) {
		Scanner masukan = new Scanner(System.in);
		System.out.println("APLIKASI BIODATA");
		// Bagian Input
		System.out.print("\tNama: ");
		String nama = masukan.nextLine();
		
		System.out.print("\tUmur: ");
		int umur = masukan.nextInt();
		
		// masukan.reset();
		// System.out.print("\tTTL: ");
		// String TTL = masukan.nextLine();
		
		System.out.print("\tTinggiBadan: ");
		int TinggiBadan = masukan.nextInt();
		masukan.close();
		
		//Bagian output ke layar (console)
		System.out.println("Data yang sudah dimasukkan ");
		System.out.println("Nama: " + nama);
		System.out.println("Umur: " + umur);
		// System.out.println("TTL: " + TTL);
		System.out.println("Tinggi Badan: " + TinggiBadan);
		
		//Bagian output ke file
		try {
			FileWriter writer = new FileWriter("MyFile.txt", true);
			writer.write("Data yang sudah dimasukkan\n");
			writer.write("Nama: " + nama + "\n");
			writer.write("Umur: " + umur + "\n");
			writer.write("Tinggi Badan: " + TinggiBadan + "\n");
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}