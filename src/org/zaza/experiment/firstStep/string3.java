public class string3 {
	
	public static boolean isProhibited(String kalimat) {
		boolean result = false;
		String[] kata = {"makan","minum","tidur","duduk","berdiri"};
		for (String s: kata) {
			if (kalimat.contains(s)) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] arg) {
		try {
			String kalimat = arg[0];
			if (isProhibited(kalimat)) {
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