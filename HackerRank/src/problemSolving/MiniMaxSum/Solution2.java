package problemSolving.MiniMaxSum;

import java.util.Scanner;
import java.util.Arrays;

public class Solution2 {

	static void miniMaxSum(int[] arr) {
		/* 
		 * use the build in quicksort to order
		 * the array in a ascending order
		 * 
		 */
		Arrays.sort(arr);
		
		long sumMin = 0, sumMax = 0;
		for(int k = 0; k < arr.length; k++) {
    		if(k <= 3) {
    			sumMin += arr[k];
    		}
    		if(k >= arr.length - 4) {
    			sumMax += arr[k];
    		}
    	}
    	System.out.println(sumMin + " " + sumMax);
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
