public class RepeatedString {

    public static String appendString(long n, String s) {
        StringBuilder sb = new StringBuilder(s); 
        long jmlLoop = (n/s.length()) - 1;       
        for(int i = 0; i < jmlLoop; i++) {
            sb.append(s);
        }               
        if (n % s.length() != 0) {
            sb.append(s.substring(0, (int)(n%s.length())));
        }
        return sb.toString();
    }

    // public static long repeatedString(String s, long n) {
    //     long result = 0;
    //     if (s.length() == 1 && s.charAt(0) == 'a') {
    //         return n;
    //     }
    //     else if (s.length() > n) {
    //         for (int i = 0; i < n; i++) {
    //             if (s.charAt(i) == 'a') {
    //                 result++;
    //             }
    //         }                
    //     }
    //     else {
    //         s = appendString(n, s);
    //         for (int i = 0; i < s.length(); i++) {
    //             if (s.charAt(i) == 'a') {
    //                 result++;
    //             }
    //         }    
    //     }
    //     return result;
    // }

    public static long countA(String s) {
        long result = 0;
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'a') {
                result++;
            }
        }
        return result;
    }

    public static long repeatedString(String s, long n) {
        return (countA(s) * (n / s.length())) + (countA(s.substring(0, (int)(n%s.length()))));
    }


    public static void main(String[] args) {

        String c = "aab";
        long d = 882787;
        
        System.out.println(repeatedString(c, d));

    }
}