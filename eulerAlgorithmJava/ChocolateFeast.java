public class ChocolateFeast {
    public static int chocolateFeast(int n, int c, int m) {
        // Write your code here
        int chocolate = n/c;
        int wrapper = n/c;

        while(wrapper >= m) {
            chocolate += (wrapper/m);
            int remainWrapper = wrapper % m;
            wrapper = remainWrapper + (wrapper/m); 
        }
        return chocolate;
    }
    public static void main(String[] args) {
        System.out.println(chocolateFeast(15, 3, 2));        
        System.out.println(chocolateFeast(10, 2, 5));        
        System.out.println(chocolateFeast(12, 4, 4));        
        System.out.println(chocolateFeast(6, 2, 2));        
        System.out.println(chocolateFeast(7, 3, 2));        
    }
}
