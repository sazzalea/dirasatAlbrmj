public class string2 {
	
	public static void main(String[] arg) {
		try {
			String kalimat = arg[0];
			// String terms[] = new String[5];
			// terms[0] = "sekolah";
			// terms[1] = "buku";
			// terms[2] = "makan";
			// terms[3] = "minum";
			// terms[4] = "pensil";
			// for (int i = 0; i < 5; i++) {
				// System.out.println(terms[i]);
			// }
			String terms[] = {"sekolah", "buku", "makan", "minum", "pensil"};
			boolean isFound = false;
			for (String s: terms) {
				if (kalimat.contains(s)) {
					isFound = true;
					break;
				}
			}
			if (isFound) {
				System.out.println("ada kata terlarang");
			}
			else {
				System.out.println("tidak ada kata terlarang");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}