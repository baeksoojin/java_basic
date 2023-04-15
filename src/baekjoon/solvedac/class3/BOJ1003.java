package baekjoon.solvedac.class3;

import java.util.Scanner;

public class BOJ1003 {

    static int countOne = 0;
    static int countZero = 0;

    public int fibo(int n){
        if(n==0){
            countZero += 1;
            return 0;
        }else if(n==1){
            countOne += 1;
            return 1;
        }else{
            return fibo(n-1)+ fibo(n-2);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int result = new BOJ1003().fibo(sc.nextInt());
            System.out.println(countZero + " " + countOne);
            countZero = 0;
            countOne = 0;
        }

    }
}
