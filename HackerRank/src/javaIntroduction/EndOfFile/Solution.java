package javaIntroduction.EndOfFile;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	/*
	 * Note that this solution works only in HackerRank, cause in the Browser a text file will be read
	 * instead of actually typing something in. 
	 * 
	 * In the File the End-Of-File does not end with an empty line, so using nextLine() before checking
	 * hasNext will always end in an Exception. HasNext on the other hand will always be true in the 
	 * Commandline do to the fact that it reads the input as string.
	 */
	
private static Scanner scan = null;
	
	public static void main(String[] args) {
		try {
			scan = new Scanner(System.in);
			ArrayList<String> input = new ArrayList<String>();

			// read the actual input
			while (scan.hasNext()) {
                input.add(scan.nextLine());
            }
			
			// print the input out
			for(int i=0; i<input.size(); i++) {
				System.out.println(i+1 + " " + input.get(i));
			}
		}
		finally {
			scan.close();
		}
	}
}
