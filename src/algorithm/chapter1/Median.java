package algorithm.chapter1;

import java.util.Scanner;

public class Median {

    public static int median(int a, int b, int c){
        if( (a>=b && a<=c) || (a<=c && a>=b)) {
            return a;
        }
        else if(  (b>=a && b<=c) || (b<=c && b>=a) ){
            return b;
        }
        else{
            return c;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(median(a,b,c));
    }
}
