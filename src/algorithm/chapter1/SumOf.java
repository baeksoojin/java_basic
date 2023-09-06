package algorithm.chapter1;

import java.util.Scanner;

public class SumOf {

    private static int sumOf(int a, int b){

        int sum = 0;
        for(int i=a; i<=b; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(sumOf(sc.nextInt(), sc.nextInt()));
    }
}
