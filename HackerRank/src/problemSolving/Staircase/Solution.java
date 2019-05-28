package problemSolving.Staircase;

import java.util.Scanner;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
    	String patternN = "", formatter;
    	
    	{
    		formatter = "%" + n + "s%n";
    	}
    	
    	for(int i = 0; i < n; i++) {
    		patternN += "#";
    		System.out.printf(formatter, patternN);
    	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
