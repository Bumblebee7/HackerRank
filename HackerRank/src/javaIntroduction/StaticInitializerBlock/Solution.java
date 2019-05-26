package javaIntroduction.StaticInitializerBlock;

import java.util.Scanner;

public class Solution {
	
	private static boolean flag;
	private static int B, H;
	
	static {
		try(Scanner scan = new Scanner(System.in)) {
			B = scan.nextInt();
			H = scan.nextInt();
		}
		
		if(B <= 0 || H <= 0) {
			flag = false;
			/*
			 * Use the following System.out.println in HackerRank, but the real Exception in the IDE
			 */
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			//throw new IllegalArgumentException("Breadth and height must be positive");
		}
		else {
			flag = true;
		}
	}
	
	public static void main(String[] args) {
		if(flag) {
			int area = B * H;
			System.out.println(area);
		}

	}

}
