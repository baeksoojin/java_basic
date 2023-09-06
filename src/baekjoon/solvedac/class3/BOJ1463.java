package baekjoon.solvedac.class3;

import java.util.Scanner;

public class BOJ1463 {

    public static void main(String[] args){

        int[] dp = new int[(int)Math.pow(10,6)+1];
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        if(n == 1){
            System.out.println(0);
        }
        else if(n==2 || n==3){
            System.out.println(1);
        }
        else{
            for(int i=4; i<n+1; i++){
                dp[i] = dp[i-1] + 1;

                if(i%2==0){//2의 배수
                    dp[i] = (dp[i/2]+1 >=  dp[i]) ?  dp[i] : dp[i/2]+1;
                }
                if(i%3==0){
                    dp[i] = (dp[i/3] + 1 >=  dp[i] ) ?  dp[i] : dp[i/3] +1;
                }
            }
            System.out.println(dp[n]);
        }


    }
}
