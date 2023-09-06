package algorithm.chapter1;

import java.util.Scanner;

public class Question {

    private static void q1(int n){

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void q2(int n){

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(2*i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void q3(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(2*i-1); j++){
                System.out.printf("%d", i%10);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        q1(n);
        q2(n);
        q3(n);
      }
}
