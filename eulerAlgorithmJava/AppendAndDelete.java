public class AppendAndDelete {

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        int lens = s.length();
        int lent = t.length();
        
        if (s.contains(t) && s.startsWith(t) && k >= (lens - lent)) {
            return "Yes";           
        }

        // else {

        // }

        while (k > 0) {
            if (s.equals(t) && k >= lent) {
                return "Yes";
            }
            else if (s.isEmpty() && k >= lent) {
                return "Yes";
            }
            else if (s.isEmpty() && k < lent) {
                return "No";
            }
            else if (t.contains(s) && t.startsWith(s)) {
                if (k == lent - lens) {
                    return "Yes";
                }
                else if (k < lent - lens) {
                    return "No";
                }
            }
            s = s.substring(0, lens-1);
            lens = s.length();
            k--; 
        }
    return "No";
    }
    

    public static void main(String[] args) {
        String s = "zzzzz";
        String t = "zzzzzzz";
        int k = 4;
        
        System.out.println(appendAndDelete(s, t, k));
    }
}
