public class squareRoot {
	
	public static void main(String[] arg) {
		for (int i = 100; i >= 1; i--) {
			double root = Math.sqrt(i);
			int rootInt = (int)root;
			if (root == rootInt) {
				System.out.println(i + ": " + rootInt + " it is integer");
			}
			else {
				System.out.println(i + ": " + root);
			}
		}
	}
}