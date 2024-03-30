/* 26 mod 10, hasil: 2, sisa: 6 ----> 10 * 2 + 6 = 26
17 mod 10, hasil: 1, sisa: 7 ----> 10 * 1 + 7 = 17
8 mod 10,  hasil: 0, sisa: 8 ----> 10 * 0 + 8 = 8
2 mod 5, hasil: 0, sisa 2 ---> 5 * 0  + 2

25 mod 10 = 5 --> 25 / 10 = 2
2 mod 10 = 2  --> 2 / 10 = 0


125 mod 10 = 5 --> 125 / 10 = 12
12 mod 10 = 2 --> 12 / 10 = 1
1 mod 10 = 1 --> 1 / 10 = 0

1234 mod 10 = 4 --> 1234 / 10 = 123 --> 0 * 10 + 4 = 4
123 mod 10 = 3 --> 123 / 10 = 12    --> 4 * 10 + 3 = 43
12 mod 10 = 2 --> 12 / 10 = 1       --> 43 * 10 + 2 = 432
1 mod 10 = 1 --> 1 / 10 = 0         --> 432 * 10 + 1 = 4321 */

public class palindrom {
	
	public static void main(String []arg) {
		int ori = 1234567;
		int rev = 0;
		// int q = ori;
		for ( int q = ori ; q != 0; q = q / 10) {
			int remainder = q % 10;
			// q = q / 10;
			rev = rev * 10 + remainder;
			System.out.println(rev);
		}
	}
}