public class seventeen {
	
	public static void main(String []arg) {
		double []myList = {1.9, 2.9, 3.4, 3.5, 4.6, 5, 6.1, 9.5, 11.3, 14.6};
		double total;
		System.out.println("total member, " + myList.length);
		/*System.out.println("member ke 0: " + myList[0]);
		System.out.println("member ke 1: " + myList[1]);
		System.out.println("member ke 2: " + myList[2]);
		System.out.println("member terakhir: " + myList[myList.length -1]);*/
		myList[0] = Math.PI;
		for (int i = 0; i < myList.length; i++) {
			System.out.println("index: " + i + ", value: " + myList[i]);
		}
	}
}