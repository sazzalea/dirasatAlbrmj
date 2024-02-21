package org.zaza.hackerrank.euler;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Euler013 {

	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      BigInteger tmp;
      BigInteger total = new BigInteger("0");
      for(int a0 = 0; a0 < t; a0++){
          String n = in.nextLine();
          tmp = new BigInteger(n);
//          System.out.println(tmp.toString());
          total = total.add(tmp);
      }
      System.out.println(total.toString().substring(0, 9));
      
    }

}
