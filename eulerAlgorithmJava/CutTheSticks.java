import java.util.ArrayList;
import java.util.List;

public class CutTheSticks {

    public static int smallestNumberNotZero(List<Integer> array) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.size(); i++) {
            if (array.get(i) == 0) {
                continue;
            }

            if (array.get(i) < min) {
                min = array.get(i);
            }
        }

        return min;
    }

    public static int summationAllElement(List<Integer> arr) {
        int sum = 0;
        for (Integer element : arr) {
            sum += element;
        }
        return sum;
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here
        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < arr.size(); j++) {
            if (summationAllElement(arr) == 0) {
                break;
            }
            int count = 0;
            int min = smallestNumberNotZero(arr);
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == 0) {
                    continue;
                }
                else{
                    arr.set(i, arr.get(i)-min);
                    count++;    
                }
            }
            result.add(count);    
        }

 
        return result;
    }
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        // 5 4 4 2 2 8 
        test.add(5);
        test.add(4);
        test.add(4);
        // test.add(0);
        test.add(2);
        test.add(2);
        test.add(8);
        // test.remove(1);
        // System.out.println(test.toString());
        // System.out.println(smallestNumberNotZero(test));
        System.out.println(cutTheSticks(test).toString());
    }
}
