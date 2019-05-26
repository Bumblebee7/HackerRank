package javaIntroduction.IntToString;

import java.util.Scanner;

public class Solution {
	
	/*
	 * In HackerRank the solution only requires:
	 *  String s = Integer.toString(n);
	 *  
	 *  I added some line to push something more "realistic" into my GitHub Repository
	 */

	public static void main(String[] args) {
		String parsedInteger;
		try(Scanner scan = new Scanner(System.in)) {
			parsedInteger = Integer.toString(scan.nextInt());
		}
		System.out.println(parsedInteger);
	}

}
