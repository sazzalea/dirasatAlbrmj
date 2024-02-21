package org.zaza.eulerAlgorithmJava;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class StaticInitializerBlock {

	static Scanner input = new Scanner(System.in);
	static int B;
	static int H;
	static boolean flag;

	static {
		try {
			B = input.nextInt();
			H = input.nextInt();
			flag = true;
			if (B <= 0 || H <= 0) {
				flag = false;
				throw new Exception("java.lang.Exception: Breadth and height must be positive");
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] arg) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}
