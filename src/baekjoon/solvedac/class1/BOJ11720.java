package baekjoon.solvedac.class1;

import java.util.Scanner;

public class BOJ11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String nums = sc.next(); // nextLine()은 개행문자를 제거하지 않아서 2번 사용해줘야함

        int sum=0;
        for(int i=0; i<n; i++){
            //int num = Integer.parseInt(nums.substring(i,i+1));
            int num = nums.charAt(i) - '0';
            sum += num;
        }

        System.out.println(sum);

    }
}
