import java.util.ArrayList;
import java.util.List;

public class AcmIcpcTeam {

    public static int counterOr(String t1, String t2) {
        int counter = 0;
        for (int i = 0; i < t1.length(); i++) {
            if ((Character.getNumericValue(t1.charAt(i))|Character.getNumericValue(t2.charAt(i))) != 0) {
                counter++;                
            }
        }
        return counter;
    }

    public static int counterMaxDiscussNum(List<Integer> list, int max) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == max) {
                counter++;
            }
        }
        return counter;
    }

    public static List<Integer> acmTeam(List<String> topic) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        List<Integer> penampungDiscussNum = new ArrayList<>();
        for (int i = 0; i < topic.size(); i++) {
            for (int j = i + 1; j < topic.size(); j++) {
                int discussNum = counterOr(topic.get(i), topic.get(j)); 
                if (discussNum  > max) {
                    max = discussNum;
                }
                penampungDiscussNum.add(discussNum);
            }
        }

        result.add(max);
        result.add(counterMaxDiscussNum(penampungDiscussNum, max));
        return result;
    }
    
    public static void main(String[] args) {
        String t1 = "10101";
        String t2 = "11100";
        String t3 = "11010";
        String t4 = "00101";
        List<String> topics = new ArrayList<>();

        topics.add(t1);
        topics.add(t2);
        topics.add(t3);
        topics.add(t4);

        System.out.println(acmTeam(topics).toString());

    }
    
}