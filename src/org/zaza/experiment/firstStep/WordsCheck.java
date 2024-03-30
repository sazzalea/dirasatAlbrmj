public class WordsCheck {
	
	// public static boolean containsWord(String p, String[] words) {
		// boolean found = false;
		// for (String word: words) {
			// if (word.contains(p)) {
				// found = true;
				// break;
			// }
		// }
		// return found;
	// }
	
	// public static boolean exactWord(String p, String[] words) {
		// boolean found = false;
		// for (String word: words) {
			// if(word.equals(p)) {
				// found = true;
				// break;
			// }
		// }
		// return found;
	// }
	
	// if (searchWord(true, searched, kamus)) {

	public static boolean searchWord(boolean check, String p, String[] words) {
		boolean found = false;
		for (String word: words) {
			if (check) { //if exact  
				if(word.equals(p)) {
					found = true;
					break;
				}
			}
			else { // if contain
				if (word.contains(p)) {
					found = true;
					break;
				}
			}
		}
		return found;
	}
	
	//java WordsCheck exact duduk --> true
	//java WordsCheck exact duk --> false
	//java WordsCheck contain duduk --> true
	//java WordsCheck contain duk --> true
	
	public static void main(String[] arg) {
		String method = arg[0];
		String kamus[] = {"rumah", "sekolah", "jalan", "duduk", "lari"};
		String searched = arg[1];
		if (method.equals("exact")) {
			if (searchWord(true, searched, kamus)) {
				System.out.println("ada kata-kata terlarang: " + searched);
			}
			else {
				System.out.println("tidak ada kata-kata terlarang");
			}
		}
		else if (method.equals("contain")) {
			if (searchWord(false, searched, kamus)) {
				System.out.println("kata-kata ini mengandung " + searched);
			}
			else {
				System.out.println("kata-kata tidak mengandung " + searched);
			}
		}
		else {
			System.out.println("exact or contain");
		}
		
	}
}