import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class Prime14 {
	
	public static boolean isPrime(int number) {
		boolean result = true;
		int p = (int)Math.sqrt(number);
		for (int i = 2; i <= p; i++) {
			if (number % i == 0) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] arg) {
		Scanner masukan = new Scanner(System.in);
		System.out.println("APLIKASI BILANGAN PRIMA\n");
		System.out.print("Jumlah: ");
		int jumlah = masukan.nextInt();
		masukan.close();
		int[] values = new int[jumlah];
		int count = 0;
		for (int i = 2;;i++) {
			if(isPrime(i)) {
				if (count == values.length) {
					break;
				}
				values[count] = i;
				count++;
			}
		}
		
		int sequence = 1;
		for (int i = values.length - 1; i >= 0; i--) {
			System.out.println(sequence++ + ". " + values[i]);
		}
		
		try {
			FileWriter writer = new FileWriter ("MyFile2.txt", false);
			writer.write("APLIKASI BILANGAN PRIMA\n");
			writer.write("Jumlah: " + jumlah + "\n");
			sequence = 1;
			for (int i = values.length - 1; i >= 0; i--) {
				writer.write(sequence++ + ". " + values[i] + "\n");
			}
			writer.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}