package javaIntroduction.EndOfFile;

import java.util.ArrayList;
import java.util.Scanner;

public class RicherSolution {
	
	private static Scanner scan = null;
	
	public static void main(String[] args) {
		try {
			scan = new Scanner(System.in);
			ArrayList<String> input = new ArrayList<String>();
			String line;
			
			// read the actual input
			while (!(line = scan.nextLine()).isEmpty()) {
                input.add(line);
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
