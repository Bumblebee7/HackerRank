package problemSolving.PlusMinus;

import java.util.Scanner;

public class Solution {

    // Complete the plusMinus function below.
    @SuppressWarnings("boxing")
	static void plusMinus(int[] arr) {
    	// declare three counter variables
    	float positiv = 0, negativ = 0, neutral = 0;
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] > 0) {
    			positiv++;
    		}
    		else if(arr[i] < 0) {
    			negativ++;
    		}
    		else {
    			neutral++;
    		}
    	}
    	// print formated decimal solution
    	System.out.printf("%.6f %n", (positiv / arr.length));
    	System.out.printf("%.6f %n", (negativ / arr.length));
    	System.out.printf("%.6f %n", (neutral / arr.length));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

