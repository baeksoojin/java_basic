package baekjoon.배열;

import java.util.Scanner;

public class BOJ10813 {

    public static int[] basket;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        basket = new int[n+1];
        for (int i = 1; i < n + 1; i++){
            basket[i] = i;
        }

        int m = sc.nextInt();

        //swap
        for (int i = 0; i < m; i++){
            swap(sc.nextInt(), sc.nextInt());
        }

        //result
        for (int i = 1; i < n + 1; i++){
            System.out.printf(basket[i] + " ");
        }
    }

    public static void swap(int a, int b){
        int temp = basket[a];
        basket[a] = basket[b];
        basket[b] = temp;
    }


}
