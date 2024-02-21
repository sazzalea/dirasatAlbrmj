package org.zaza.eulerAlgorithmJava;

//import java.util.Scanner;

public class Staircase {
	
	public static void staircase(int number) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= number; i++) {
			for (int k = number - i; k >= 1; k--) {
				sb.append(' ');
			}
			for (int j = 0; j < i; j++) {
				sb.append('#');
			}
			if (i < number) {
				sb.append('\n');
			}
		}
		String str = sb.toString();
		System.out.println(str);
	}
	
//    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(6);

//        scanner.close();
//		System.out.printf("%15s", "Hello");
	}

}
