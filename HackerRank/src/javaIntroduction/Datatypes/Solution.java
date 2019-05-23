package javaIntroduction.Datatypes;

import java.util.Scanner;

public class Solution {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
	
	    scan = new Scanner(System.in);
	    int times = scan.nextInt();

	    for(int i=0; i<times; i++) {

	        try {
	            long x = scan.nextLong();
	            System.out.println(x + " can be fitted in:");
	            if(x >= -128 && x <= 127) {
	            	System.out.println("* byte");
	            }
	            if(x>=-32768 && x<=32767) {
		            System.out.println("* short");
	            }
	            if(x >= Math.pow(-2,31) && x < Math.pow(2,31)) {
	            	// between -2147483648 and 2147483647
		            System.out.println("* int");
	            }
	            if(x >= Math.pow(-2,63) && x <= Math.pow(2,63)) {
	            	// between -9223372036854775808L and 9223372036854775807L
		            System.out.println("* long");
	            }
	        }
	        catch(Exception e)
	        {
	            System.out.println(scan.next() + " can't be fitted anywhere.");
	        }

	    }
	    scan.close();
	}
}
