public class prime13 {
	
	public static boolean isPrime(int number) {
		boolean result = true;
		int p = (int)Math.sqrt(number);		
		for (int i = 2; i <= p; i++) {
			if (number % i == 0) {
				result = false;
				break;
			}
		}
		return result;
	} 
	
	public static void main(String[] arg) {
		int[] values = new int[10]; 
		int count = 0;
		for (int i = 2; ; i++) {
			if (isPrime(i)) {
				if (count == values.length) {
					break;
				}
				values[count] = i;
				count++;
			}
		}	
		
		StringBuilder sb = new StringBuilder();
		for (int i = values.length - 1; i >= 0; i--) {
			sb.append(values[i]);
			sb.append("\n");
		}
		String str = sb.toString();
		System.out.println(str);
	}
}
//2,3,5,7,11,13,17,19,23,29