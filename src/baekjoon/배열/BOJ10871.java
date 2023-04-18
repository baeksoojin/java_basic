package baekjoon.배열;

import java.util.Scanner;

public class BOJ10871 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        for(int i=0; i<n; i++){
            int inputX = sc.nextInt();
            if (inputX < x){
                System.out.printf(inputX + " ");
            }
        }
    }

}
