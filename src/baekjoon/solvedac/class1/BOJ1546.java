package baekjoon.solvedac.class1;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1546 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] score = new int[n];
        for(int i=0; i<n; i++){
           score[i] = sc.nextInt();
        }

        int max = Arrays.stream(score).max().getAsInt();

        Float avg = new Float(0);
        for(int s : score){
            Float changeS = Float.valueOf(s)/max *100;
            avg += changeS;
        }

        System.out.println(avg/n);

    }
}
