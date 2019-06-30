package interviewPreparationKit.warmUp.CountingValleys;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    /*
     * it is only necessary to count the amount of switches from a negative current Level to a 
     * positive current Level to detect a Valley, because every hike begins at sea level equal to zero.
     */
    static int countingValleys(int n, String s) {
    	int currLevel = 0, oldLevel = 0, sumOfValleys = 0;
    	for(int i = 0; i < n; i++) {
    		oldLevel = currLevel;
    		if(s.substring(i, i+1).equalsIgnoreCase("D")) {
    			currLevel--;
    		}
    		else if(s.substring(i, i+1).equalsIgnoreCase("U")) {
                currLevel++;
                if(oldLevel < 0 && currLevel == 0) {
                    sumOfValleys++;
                }
            }
    		else throw new IllegalArgumentException("Not a valid Input!");
    	}
    	return sumOfValleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
