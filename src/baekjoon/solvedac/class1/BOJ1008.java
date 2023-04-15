package baekjoon.solvedac.class1;

import java.util.Scanner;

public class BOJ1008 {

    /**
     * double -> 소수점 8자리까지
     * float -> 소수점 4자리까지
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println(a/b);
    }
}
