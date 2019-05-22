package javaIntroduction.IfElse;

import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String WEIRD = "Weird";
    private static final String NOT_WEIRED = "Not Weird";

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        /* 
         * First decide if N is odd or even
         * 
         * 1 = odd and 0 is even
         */
        if ((N % 2) == 1) {
        	System.out.println(WEIRD);
        }
        else {
        	/*
        	 * decide in which range N is
        	 */
        	if (N >= 6 && N <= 20) {
        		System.out.println(WEIRD);
        	}
        	else {
            	System.out.println(NOT_WEIRED);	
        	}
        }
    }
}

