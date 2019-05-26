package problemSolving.SolveMeFirst;

import java.util.Scanner;

public class Solution {

	static int solveMeFirst(int a, int b) {
	      return a + b;
		}

	 public static void main(String[] args) {
	        int sum;
	        try(Scanner in = new Scanner(System.in)) {
	        	int a;
	 	        a = in.nextInt();
	 	        int b;
	 	        b = in.nextInt();
		        sum = solveMeFirst(a, b);
	        }

	        System.out.println(sum);
		}

}
