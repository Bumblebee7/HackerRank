package interviewPreparationKit.warmUp.RepeatedString;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
    	// For example: ['a','b','a'], 10
    	long numOfAs = 0;
    	long factor = n / s.length();
    	long rest = 0;

    	// sum of a's in the provided string
    	// For example: 2
    	for(char c : s.toCharArray()) {
    		if(c == 'a') {
    			numOfAs++;
    		}
    	}
    	
    	// to sum up a's missing by the division of n % s.length on the outter right side of the resulting string
    	//  For example: 10 % 3 = 1 --> check if first char in s equals 'a'
    	for(int i = 0; i < n % s.length(); i++) {
    		if(s.charAt(i)  == 'a') {
    			rest++;
    		}
    	}
    	
    	// 2 * 3 + 1
    	return numOfAs * factor + rest;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

