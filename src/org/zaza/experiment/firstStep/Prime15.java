import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class Prime15 {
	
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
	
	public static void populateArray(int[] numbers) {
		int count = 0;
		for (int i = 2;;i++) {
			if(isPrime(i)) {
				if (count == numbers.length) {
					break;
				}
				numbers[count] = i;
				count++;
			}
		}
	}
	
	public static void showArray(int[] numbers) {
		int sequence = 1;
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(sequence++ + ". " + numbers[i]);
		}
	}
	
	public static void saveToFile(int[] phrases) {
		try {
			FileWriter writer = new FileWriter ("MyFile2.txt", false);
			writer.write("APLIKASI BILANGAN PRIMA\n");
			writer.write("Jumlah: " + phrases.length + "\n");
			int sequence = 1;
			for (int i = phrases.length - 1; i >= 0; i--) {
				writer.write(sequence++ + ". " + phrases[i] + "\n");
			}
			writer.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public static int getInput() {
		Scanner masukan = new Scanner(System.in);
		System.out.println("APLIKASI BILANGAN PRIMA\n");
		System.out.print("Jumlah: ");
		int jumlah = masukan.nextInt();
		masukan.close();
		return jumlah;
	}
	
	public static void main(String[] arg) {
		int numberOfPrime = getInput();
		int[] values = new int[numberOfPrime];
		populateArray(values);
		showArray(values);
		saveToFile(values);
	}
}