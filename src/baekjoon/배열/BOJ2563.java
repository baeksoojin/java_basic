package baekjoon.배열;

import java.util.Scanner;

public class BOJ2563 {

    public static int[][] paper = new int[100][100];
    public static int paperSize = 10;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;

            for (int j = x; j < x+paperSize; j++){
                for (int k = y; k < y+paperSize; k++){
                    paper[j][k] = 1;
                }
            }
        }

        int s = 0;
        for (int i=0; i<100; i++){
            for (int j=0; j<100; j++){
                if(paper[i][j]==1){
                    s++;
                }
            }
        }

        System.out.println(s);
    }
}
