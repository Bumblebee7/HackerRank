package javaIntroduction.Datatypes;

import java.util.Scanner;

public class Solution {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		 
		try {
			scan = new Scanner(System.in);
			int times = scan.nextInt();
			
			for(int i=0;i<times;i++) {
					long x = scan.nextLong();
					
					if(x>=-9223372036854775808L && x<=9223372036854775807L) {
						System.out.printf("%d can be fitted in:%n", x);
						System.out.println("* long");
						if(x>=-2147483648 && x<=2147483647) {
							System.out.println("* integer");
							if(x>=-32768 && x<=32767) {
								System.out.println("* short");
								if(x>=-128 && x<=127) {
									System.out.println("* byte");
								}
							}
						}
					}
				}
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			scan.close();
		}
	}
}
