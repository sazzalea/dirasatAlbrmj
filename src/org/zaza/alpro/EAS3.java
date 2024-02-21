package org.zaza.alpro;

public class EAS3 {

	public static void misteri(int[] larikA){ 
		for (int x = larikA.length - 1; x >= 1; x--){ 
			for (int j = 0; j <= x; j++){ 
				if (larikA[j] > larikA[x]) 
//					System.out.println(larikA[j] + " > " + larikA[x]);
					aneh(larikA, j, x); 
				} 
			}
		}	
	
	public static void aneh(int[] larikB, int indekj, int indekx){ 
		int sementara;
		sementara = larikB[indekx]; 
		larikB[indekx] = larikB[indekj]; 
		larikB[indekj] = sementara; 
		System.out.println(larikB[indekj]);
		}	
	

	public static void main(String[] arg) {
		int[] larikInt = {1, 7, 8, 4, 5};
		misteri(larikInt);
	}
}
