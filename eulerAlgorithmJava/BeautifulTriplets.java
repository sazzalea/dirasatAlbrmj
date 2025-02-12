import java.util.ArrayList;
import java.util.List;

public class BeautifulTriplets {

    // public static int indexCalonTriplet(List<Integer> list, int d) {
    //     int index = 0;
    //     return index;
    // }

    public static void main(String[] args) {
        // arr[] size n = 7, d = 3
        // arr = [1, 2, 4, 5, 7, 8, 10]
        int d = 3;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(10);

        int triplets = 0;
        for (int i = 0; i < list.size(); i++) {
            int sum = d + list.get(i);
            if (list.contains(sum)) {
                sum = sum + d;
                if (list.contains(sum)) {
                    triplets++;
                }
            }
        }

        System.out.println(triplets);

        // int counter = 0;
        // // loop dari belakang k - d sampe ketemu j
        // for (int a = list.size()-1; a >= 0; a--) {
        //     for (int b = a - 1; b >= 0 ; b--) {
        //         if (list.get(a) - list.get(b) == d) {
        //             // index = list.indexOf(list.get(b));
        //             for (int j = list.indexOf(list.get(b)); j >= 0; j--) {
        //                 for (int k = j-1; k >= 0; k--) {
        //                     if (list.get(j) - list.get(k) == d) {
        //                         counter++;
        //                         // for (int x = list.indexOf(list.get(k)); x >= 0; x--) {
        //                         //     for (int y = x-1; y >= 0; y--) {
        //                         //         if (list.get(x) - list.get(y) == 3) {
        //                         //             counter++;
        //                         //         }
        //                         //     }
        //                         // }
        //                     }
        //                 }
        //             }
        //         }
        //     }
        // }
        // System.out.println(counter);

        // kalo dah dapet j, ambil indexnya
        // dari index j loop sampe akhir j-d sampe ketemu i
        //variabel counter ++
    }
}
