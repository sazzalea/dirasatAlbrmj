package org.zaza.Cpro;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int[][] arr = {{1, 2},
						{3, 4}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					sum += arr[i][j];
				}
//				System.out.print(arr[i][j] + " ");
			}
//			System.out.println();
		}
		System.out.println(sum);
	}

}
