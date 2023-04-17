package baekjoon.solvedac.class1;

import java.util.Scanner;

public class BOJ2908 {

    public static int digit = 3;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();

        int swapNum1 = Integer.parseInt(getSwapNum(num1, ""));
        int swapNum2 = Integer.parseInt(getSwapNum(num2, ""));
        int result = swapNum1 > swapNum2 ? swapNum1 : swapNum2;
        System.out.println(result);

    }

    private static String getSwapNum(String num1, String swapNum) {
        for(int i=0; i<digit ; i++){
            int numTemp = num1.charAt(digit-i-1) - '0';
            swapNum += numTemp;
        }
        return swapNum;
    }
}
