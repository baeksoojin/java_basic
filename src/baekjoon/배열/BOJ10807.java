package baekjoon.배열;

import java.util.Scanner;

public class BOJ10807 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;

        int n = sc.nextInt();

        int[] nums = new int[101];
        for ( int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int findNum = sc.nextInt();
        for ( int i = 0; i < n; i++){
            if(nums[i] == findNum){
                answer ++;
            }
        }

        System.out.println(answer);
    }
}
