package problemSolving.BirthdayCakeCandles;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] arr) {
    	int numOfCandles = 0, highestSize = 0;
    	for(int i = 0; i < arr.length; i++) {
    		/*
    		 * check if you found a new highest size
    		 */
    		if(arr[i] > highestSize) {
    			numOfCandles = 1;
    			highestSize = arr[i];
    		}
    		else if(arr[i] == highestSize) {
    			numOfCandles++;
    		}
    	}
    	return numOfCandles;
    }

    public static void main(String[] args) throws IOException {
        try(Scanner scanner = new Scanner(System.in)) {
        	int arCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] ar = new int[arCount];

            String[] arItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < arCount; i++) {
                int arItem = Integer.parseInt(arItems[i]);
                ar[i] = arItem;
            }
            
            System.out.println(birthdayCakeCandles(ar));
        }
    }
}
