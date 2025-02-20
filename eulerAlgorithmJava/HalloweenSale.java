public class HalloweenSale {

    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        // int counter = 1;
        // int yangHarusDibayar = p;
        // while (p >= m) {
        //     if ((p-d) <= m) {
        //         yangHarusDibayar += m;
        //         counter++;
        //         break;                
        //     }
        //     yangHarusDibayar += (p-d);
        //     counter++;
        //     p -= d;
        // }
        
        // if ((s - yangHarusDibayar) >= m) {
        //     counter++;
        //     s -= m;
        // }
        // return counter;
        // int howManyGames(int p, int d, int m, int s) {
        //     int result = 0;
        //     while( s >= p){
        //         s -= p;
        //         p = max(m, p-d);
        //         result++;
        //     }
        //     return result;
        // }
        int games = 0;
        while (s >= p) {
            s -= p;
            p = Math.max(m, p-d);
            games++;
        }
        return games;
    }
    
    public static void main(String[] args) {
        // 20 3 6 80
        // int p = 20;
        // int d = 3;
        // int m = 6;
        // int s = 80;
        // 20 3 6 85
        int p = 20;
        int d = 3;
        int m = 6;
        int s = 85;

        System.out.println(howManyGames(p, d, m, s));

        // System.out.println(counter);
        // System.out.println("p: " + p);
        // System.out.println("yang harus dibayar: " + yangHarusDibayar);
        // System.out.println("sisa budget: " + (s - yangHarusDibayar));

    }
}
