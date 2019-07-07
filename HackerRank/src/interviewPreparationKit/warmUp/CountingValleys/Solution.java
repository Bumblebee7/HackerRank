package interviewPreparationKit.warmUp.CountingValleys;

import java.io.*;
import java.util.*;

public class Solution {

    /*
     * it is only necessary to count the amount of switches from a negative current Level to a 
     * positive current Level to detect a Valley, because every hike begins at sea level equal to zero.
     */
    static int countingValleys(int n, String s) {
    	int currLevel = 0, oldLevel = 0, sumOfValleys = 0;
    	for(char currChar : s.toCharArray()) {
    		oldLevel = currLevel;
    		if(currChar == 'D') {
    			currLevel--;
    		}
    		else if(currChar == 'U') {
                currLevel++;
                if(oldLevel < 0 && currLevel == 0) {
                    sumOfValleys++;
                }
            }
    		else throw new IllegalArgumentException("Not a valid Input!");
    	}
    	return sumOfValleys;
    }
}
