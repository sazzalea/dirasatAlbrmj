package org.zaza.Cpro;

public class ManipulasiString {
	
	public static boolean palindrome(String s) {
		boolean result = false;
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) == s.charAt((s.length()-1))-i) {
				result = true;			
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindrome("madam"));
//		String s = "madam";
//		System.out.println(s.charAt(1));
	}

}
