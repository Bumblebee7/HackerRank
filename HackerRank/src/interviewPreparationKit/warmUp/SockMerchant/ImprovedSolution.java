package interviewPreparationKit.warmUp.SockMerchant;

import java.io.*;
import java.util.*;

public class ImprovedSolution {

    // Complete the sockMerchant function below.
    static void sockMerchant(int n, int[] arr) {
    	Map<Integer, Integer> matchingPairs = new HashMap<Integer, Integer>();
    	/*
    	 * Sort the array in ascending order
    	 */
    	Arrays.sort(arr);
    	int leftSock = -1, rightSock = -1;
    	for(int i = 0; i < arr.length - 1; i++) {
    		leftSock = arr[i];
    		rightSock = arr[i + 1];
    		if(leftSock == rightSock) {
    			if(matchingPairs.containsKey(leftSock)) {
    				matchingPairs.put(leftSock, matchingPairs.get(leftSock) + 1);
    			}
    			else {
    				matchingPairs.put(leftSock, 1);
    			}
    			i++; // to skip one sock;
    		}
    	}
    	
        System.out.println("The matching pairs are: " + matchingPairs); 
    }
}
