package baekjoon.solvedac.class1;

import java.util.Scanner;

public class BOJ10818 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = -1;
        int min = 9999999;

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            max = max > num ? max : num;
            min = min < num ? min : num;
        }
        System.out.println(min + " " +  max);
    }
}
