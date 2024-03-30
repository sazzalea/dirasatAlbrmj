import java.util.Scanner;

public class test3 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
        String tmpint;
        System.out.print("Enter string 1: "); String tmp1 = sc.nextLine();
        System.out.print("Enter integer 1: "); tmpint = sc.nextLine(); int int1 = Integer.parseInt(tmpint);
        // System.out.print("Enter integer 1: "); int int1 = sc.nextInt();  sc.nextLine();
        System.out.print("Enter string 2: "); String tmp2 = sc.nextLine();
        System.out.print("Enter integer 2: "); tmpint = sc.nextLine(); int int2 = Integer.parseInt(tmpint);
        // System.out.print("Enter integer 2: "); int int2 = sc.nextInt();  sc.nextLine();
        System.out.print("Enter string 3: "); String tmp3 = sc.nextLine();
        System.out.println("you typed: " + tmp1);
        System.out.println("you typed: " + int1);
        System.out.println("you typed: " + tmp2);
        System.out.println("you typed: " + int2);
        System.out.println("you typed: " + tmp3);

	}
}