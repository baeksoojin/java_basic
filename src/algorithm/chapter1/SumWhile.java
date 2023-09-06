package algorithm.chapter1;

import java.util.Scanner;

public class SumWhile {

    private static void sumWhileByN(int n){

        int i=0;
        while(i<n){
            System.out.println(i++);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sumWhileByN(n);


    }
}
