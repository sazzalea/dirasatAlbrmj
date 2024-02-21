package org.zaza.eulerDataStructure;

public class Array2DDs {

    static int hourglassSum(int[][] arr) {
    	int highestHourGlassSum = Integer.MIN_VALUE;
    	int hourGlass = 0;
    	for (int i = 0; i < arr.length - 2; i++) {
    		for (int j = 0; j < arr[i].length - 2; j++) {
//    			int hourglassmember1 = arr[i][j] + arr[i][j+1] + arr[i][j+2];
//    			int hourglassmember2 = arr[i+1][j+1];
//    			int hourglassmember3 = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

    			//    			Gaya Kedua
//    			hourGlass = hourglassmember1 + hourglassmember2 + hourglassmember3; 
//    			hourGlass = arr[i][j] + arr[i][j+1] + arr[i][j+2];
//    			hourGlass += arr[i+1][j+1];
//    			hourGlass += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

    			//    			Gaya Ketiga
    			hourGlass = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
    									arr[i+1][j+1] +
    						arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
        		if (highestHourGlassSum < hourGlass) {
        			highestHourGlassSum = hourGlass;
        		}
    		}
    	}
    	return highestHourGlassSum;
    }
	
	public static void main(String[] args) {
		int[][] array2D = {{-1, -1, 0, -9, -2, -2 },
							{-2, -1, -6, -8, -2, -5},
							{-1, -1, -1, -2, -3, -4},
							{-1, -9, -2, -4, -4, -5},
							{-7, -3, -3, -2, -9, -9},
							{-1, -3, -1, -2, -4, -5}};
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(hourglassSum(array2D));
	}

}
