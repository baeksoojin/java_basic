package baekjoon.배열;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10810 {

    public static int[] basket;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        basket = new int[n+1];
        Arrays.fill(basket, 0);

        putBall(sc, m, basket);

        for ( int i = 1; i < n + 1; i++){
            System.out.printf(basket[i] + " ");
        }
    }

    private static void putBall(Scanner sc, int m, int[] basket) {
        for (int i = 0; i < m; i++){

            int start = sc.nextInt();
            int end = sc.nextInt();
            int quan = sc.nextInt();

            for ( int j = start; j < end+1 ; j++ ){
                basket[j] = quan;
            }
        }
    }
}
