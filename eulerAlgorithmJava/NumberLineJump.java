package org.zaza.eulerAlgorithmJava;

public class NumberLineJump {
	
    public static String kangaroo(int x1, int v1, int x2, int v2) {
//        int jumpsCount = (v2 < v1) ? (x1 - x2) / (v2 - v1) : -1;
//        boolean isMultiply = (v1 != v2) ? (x2 - x1) % (v1 - v2) == 0 : false;
        int jumpsCount = -1;
        boolean isMultiply = false;
        if (v2 < v1) {
        	jumpsCount = (x1 - x2) / (v2 - v1);
        	isMultiply = (x2 - x1) % (v1 - v2) == 0;
        }
        return (isMultiply && jumpsCount > 0)  ? "YES" : "NO";
    }

	public static void main(String[] arg) {
		int posisi1 = 43;
		int kecepatan1 = 2;
		int posisi2 = 70;
		int kecepatan2 = 2;
		System.out.println(kangaroo(posisi1, kecepatan1, posisi2, kecepatan2));
	}
}
