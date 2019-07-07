package interviewPreparationKit.warmUp.JumpingOnTheClouds;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {
        int minJumps = 0, currPos = 0;
        while (currPos < c.length - 1) {
            if(currPos + 2 < c.length && c[currPos + 2] == 0) {
                currPos += 2;
            }
            else {
                currPos ++;
            }
            minJumps++;
        }
        return minJumps;
    }
}
