package javaIntroduction.LoopsI;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for(int i = 1; i <= 10; i++){
            int result = N * i;
            System.out.printf("%d x %d = %d%n", N, i, result);
        }
    }
}
