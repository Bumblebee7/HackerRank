package problemSolving.MiniMaxSum;

import java.util.Scanner;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	/*
    	 * use a bubblesort to sort the array
    	 */
    	int temp;
    	/*
    	 * use long because in some cases the
    	 * MAX_VALUE of int is not high enough
    	 * so the value turns into negative
    	 * values
    	 */
    	long sumMax = 0, sumMin = 0;
    	for(int i = arr.length; i > 1; --i) {
    		for(int j = 0; j < i - 1; ++j) {
    			if (arr[j] < arr[j + 1]) {
    				temp = arr[j];
    				arr[j] = arr[j + 1];
    				arr[j + 1] = temp;
    			}
    		}
    	}
    	/*
    	 * use the sorted array to add up the sum
    	 * in the ascending sorted array the first 
    	 * four entries are sumMax and the last four
    	 * entries are sumMin
    	 */
    	
    	for(int k = 0; k < arr.length; k++) {
    		if(k <= 3) {
    			sumMax += arr[k];
    		}
    		if(k >= arr.length - 4) {
    			sumMin += arr[k];
    		}
    	}
    	System.out.println(sumMin + " " + sumMax);
    }
    
    
    /*
     * quick and dirty helper for debugging
     */
    static void printArr(int[] arrToPrint) {
    	System.out.println("--- NEW PRINT ---");
    	for(int i = 0; i < arrToPrint.length; i++) {
    		System.out.print(arrToPrint[i] + " ");
    	}
    	System.out.println();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

