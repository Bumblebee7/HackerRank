package interviewPreparationKit.warmUp.SockMerchant;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] arr) {
    	int matchingPairs = 0;
    	/*
    	 * Sort the array in ascending order
    	 */
    	Arrays.sort(arr);
    	int leftSock = -1, rightSock = -1;
    	for(int i = 0; i < arr.length - 1; i++) {
    		leftSock = arr[i];
    		rightSock = arr[i + 1];
    		if(leftSock == rightSock) {
    			matchingPairs++;
    			i++; // to skip one sock;
    		}
    	}
    	
    	return matchingPairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
