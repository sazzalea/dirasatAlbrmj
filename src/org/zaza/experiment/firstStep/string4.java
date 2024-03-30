public class string4 {
	
	public static void main(String[] arg) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 10; i++) {
			sb.append(i);
			sb.append("\n");
		}
		String str = sb.toString();
		System.out.println(str);
	}
