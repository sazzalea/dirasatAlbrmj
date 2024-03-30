public class string1 {
	
	public static void main(String[] arg) {
		String nama = "Siti Azzalea Annisa";
		String nama2 = "siti Azzalea Annisa";
		// if (nama.equals(nama2)) {}
		// if (nama.equalsIgnoreCase(nama2)) {
		// if (nama.equalsIgnoreCase("siti Azzalea Annisa")) {
		if (nama.contains("z")) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		System.out.println("nama " + nama);
		System.out.println("nama " + nama.toUpperCase());
		System.out.println("nama " + nama.toLowerCase());
		System.out.println("substring dari karakter ke 5 " + nama.substring(5));
		System.out.println("substring dari karakter ke 5 s.d 12 " + nama.substring(5, 12));
		System.out.println("panjang nama " + nama.length());
		for (int q = 0; q < nama.length(); q++) {
			// System.out.print("karakter ke " + q + ": " + nama.charAt(q) + " - ");
			System.out.print(nama.charAt(q) + "\t");
		}
		System.out.println("\n====================================");
		byte[] arrNamaBytes = nama.getBytes();
		// for (int i = 0; i < arrNamaBytes.length; i++) {
			// System.out.print(arrNamaBytes[i] + "\t");
		// }
		for (byte b: arrNamaBytes) {
			System.out.print(b + "\t");
		} 
		
		System.out.println("\n====================================");
		char[] arrNamaChar = nama.toCharArray();
		// for (int i = 0; i < arrNamaChar.length; i++) {
			// System.out.print(arrNamaChar[i] + "\t");
		// }
		for (char c: arrNamaChar) {
			System.out.print(c + "\t");
		}
		System.out.println("\n====================================");
		String[] arrNamaString = nama.split(" ");
		for (String s: arrNamaString) {
			System.out.print(s + "\n");
		}
		
		
		for (int p = 0; p < nama.length(); p++) {
			System.out.println("substring dari char ke " + p + ": " + nama.substring(p));
		}
		for (int p = 0; p < nama.length(); p++) {
			System.out.println("substring dari char 0 s.d. ke " + p + ": " + nama.substring(0, p));
		}
		
		
	}
}