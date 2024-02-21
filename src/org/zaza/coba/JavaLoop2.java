package org.zaza.coba;

import java.util.*;
import java.io.*;

public class JavaLoop2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int akumulasi = a;
            for (int j = 0; j < n; j++) {
            	int pangkat = (int)Math.pow(2, j);
            	akumulasi += b * pangkat;
            	System.out.printf("%d ", akumulasi);
            }
            System.out.println();
        }
        in.close();
    }

}
