import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumDistance {
    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        int minDistance = Integer.MAX_VALUE;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a.size(); i++) {
            if (map.containsKey(a.get(i))) {
                minDistance = Math.min(i - map.get(a.get(i)), minDistance);
            }
            map.put(a.get(i), i);
        }

        if (minDistance == Integer.MAX_VALUE) {
            minDistance = -1;
        }

        return minDistance;
    
        }
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // [7, 1, 3, 4, 1, 7]
        list.add(7);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(7);

    }
}
