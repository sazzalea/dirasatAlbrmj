package org.zaza.eulerAlgorithmJava;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ComparatorBirthdayCakeCandles implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2;
	}

}

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    	int result = 0;
    	ComparatorBirthdayCakeCandles c = new ComparatorBirthdayCakeCandles(); 
		candles.sort(c);
    	int highest = candles.get(candles.size() - 1);
		for (int i = candles.size() - 1; i >= 0 ; i--) {
			if (highest == candles.get(i)) {
				result++;
			}
			else {
				break;
			}
    	}
    	return result;
    }

}

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
//
    		List<Integer> candles = new ArrayList<Integer>(); 
    		candles.add(3);
    		candles.add(2);
    		candles.add(1);
    		candles.add(3);
    		int result = Result.birthdayCakeCandles(candles);
    		System.out.println(result);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }

}
