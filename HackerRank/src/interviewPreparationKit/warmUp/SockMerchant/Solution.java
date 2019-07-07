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
}
