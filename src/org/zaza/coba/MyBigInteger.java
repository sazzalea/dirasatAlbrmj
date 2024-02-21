package org.zaza.coba;

import java.math.BigInteger;

public class MyBigInteger {

	public static void main(String[] args) {
		
		int a, b;
		BigInteger A, B;
		
		a = 54;
		b = 23;
		
		A = new BigInteger("54545454545454545454");
		B = new BigInteger("1");
		B = B.add(A);
		
		System.out.println(A.toString());
		System.out.println(B.toString());
		
		BigInteger C = new BigInteger("24");
		BigInteger D = new BigInteger("12");
		BigInteger fpb = C.gcd(D);
		System.out.println(fpb);
	}

}
