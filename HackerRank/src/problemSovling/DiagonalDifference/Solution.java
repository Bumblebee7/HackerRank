package problemSovling.DiagonalDifference;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
    	int sumA = 0, sumB = 0;
    	for(int i = 0; i < arr.length; i++) {
    		for(int j = 0; j < arr.length; j++) {
    			// example values are 00 11 22 33
    			if(i == j) {
    				sumA += arr[i][j];
    				System.out.println("sumA: " + sumA);
    			}
    			// example values are 03 12 21 30
    			if(i + j == arr.length - 1) {
    				sumB += arr[i][j];
    				System.out.println("sumB: " + sumB);
    			}
    		}
    	}
    	return Math.abs(sumA - sumB);
    }


    public static void main(String[] args) {
    	int[][] resultArr = {
    			{11, 2, 4},
    			{4, 5, 6},
    			{10, 8, -12}
    			};
    	
    	System.out.println(diagonalDifference(resultArr));
	}
}

