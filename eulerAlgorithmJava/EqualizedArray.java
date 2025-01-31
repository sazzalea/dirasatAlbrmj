import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualizedArray {

    public static int countFreq(List<Integer> arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if (map.containsKey(arr.get(i))) {
                map.put(arr.get(i), map.get(arr.get(i))+1);
            }
            else {
                map.put(arr.get(i), 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        return Collections.max(map.values());
    } 

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // list.add(3);
        // list.add(3);
        // list.add(2);
        // list.add(1);
        // list.add(3);

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        int n = 4;

        int element = countFreq(list, n);

        System.out.println(list.size()-element);

    }
}
