package baekjoon.solvedac.class3;

import java.util.Scanner;

public class BOJ1003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[42];
        dp[0] = 1;
        dp[1] = 0;
        for(int j=2; j<42; j++){
            dp[j] = dp[j-1] + dp[j-2];
        }

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            System.out.println(dp[num] + " " + dp[num+1]);
        }


    }
}
