public class test {
	public static void main(String []arg) {
		String str = arg[0];
		// char c_awal = str.charAt(0);
		// char c_akhir = str.charAt(str.length()-1);
		// System.out.println(str);
		// System.out.println(str.length());
		// System.out.println(c_awal);
		// System.out.println(c_akhir);
		for (int i = 0; i <= str.length() - 1;i++) {
			System.out.println(str.charAt(i));
		}
	}
}