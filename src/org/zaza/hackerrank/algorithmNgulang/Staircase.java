package org.zaza.hackerrank.algorithmNgulang;

public class Staircase {
	
    public static void staircase(int n) {
    	for (int i = 1; i <= n; i++) {
    		for (int k = n-i; k >= 1; k--) {
    			System.out.print(' ');
    		}
    		for (int j = 0; j < i; j++) {
    			System.out.print('#');
    		}
    		if (i < n) {
    			System.out.println();
    		}
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staircase(6);
	}

}
