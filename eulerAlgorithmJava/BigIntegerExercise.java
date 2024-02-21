package org.zaza.eulerAlgorithmJava;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class BigIntegerExercise {

	public static void main(String[] arg) {
	      Scanner in = new Scanner(System.in);
	      BigInteger angka1 = in.nextBigInteger();
	      BigInteger angka2 = in.nextBigInteger();
	      in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	      
	      BigInteger sum = new BigInteger("0");
	      sum = angka2.add(angka1);
	      System.out.println(sum.toString());
	      
	      BigInteger product = new BigInteger("1");
	      product = angka1.multiply(angka2);
	      System.out.println(product.toString());
	}
}
