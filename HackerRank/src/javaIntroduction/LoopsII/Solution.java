package javaIntroduction.LoopsII;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		
		// amount of input triples
		for(int i=0;i<times;i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int n = scan.nextInt();
			int oldVar = 0;
			
			for(int j=0;j<n;j++) {
				int newVar = oldVar + (int) (Math.pow(2, j) * b);
				System.out.print(a + newVar + " ");
				oldVar = newVar;
			}
			System.out.println();
		}
	}

}
