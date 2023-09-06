package algorithm.chapter1;

import java.util.Scanner;

public class Code1 {

    private static int getMax(int a, int b){
        return a>=b ? a :b;
    }

    public static void main(String[] args){
        /**
         * 3항 연산자 : a?b:c
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("max = " + getMax(sc.nextInt(), sc.nextInt()));
    }
}
