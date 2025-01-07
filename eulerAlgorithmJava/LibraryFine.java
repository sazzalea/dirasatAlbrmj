public class LibraryFine {

    // upload 3 jan 2025
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        int fine = 0;

        // if (y1 > y2) {
        //     fine = 10000;
        // }
        // else {
        //     if (m1 > m2) {
        //         fine = 500 * (m1 - m2);
        //     }
        //     else {
        //         if (d1 > d2) {
        //             fine = 15 * (d1 - d2);
        //         }
        //     }
        // }

        if (y1 > y2) {
            fine = 10000;
        }
        else if (y1 == y2) {
            if (m1 > m2) {
                fine = 500 * (m1 - m2); 
            }
            else if (m1 == m2) {
                if (d1 > d2) {
                    fine = 15 * (d1 - d2);
                }
            }
        }
            
        return fine;
    }
    
    public static void main(String[] args) {
        // int y2 = 2015;
        // int m2 = 6;
        // int d2 = 6;

        // int y1 = 2015;
        // int m1 = 6;
        // int d1 = 9;

        // due
        int y2 = 1015;
        int m2 = 1;
        int d2 = 1;

        // return
        int y1 = 1014;
        int m1 = 7;
        int d1 = 2;

        System.out.println(libraryFine(d1, m1, y1, d2, m2, y2));

    }
    
}
