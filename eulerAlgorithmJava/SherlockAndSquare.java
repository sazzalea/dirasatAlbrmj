public class SherlockAndSquare {

    public static int squares(int a, int b) {
        // Write your code here
        int count = 0;

        // for (int i = a; i <= b; i++) {
        //     double sqrt = Math.sqrt(i);
        //     if (sqrt == Math.floor(sqrt)) {
        //         count++;
        //     }
        // }

        int min = (int) Math.ceil(Math.sqrt(a));
        int max = (int) Math.floor(Math.sqrt(b));
        int i = min;
        while (i <= max) {
            if (Math.pow(i, 2) >= a && Math.pow(i, 2) <= b){
                count++;                
            }
            i++;          
        }

        return count;
    }
    
    public static void main(String[] args) {
        
    }
}
