package baekjoon.문자열;

import java.util.Scanner;

public class BOJ2675 {

    public static void answer(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int r = sc.nextInt();
            String s = sc.next();
            String result = "";
            for(int j=0; j<s.length(); j++){
                char temp = s.charAt(j);
                for(int k=0; k<r; k++){
                    result += temp;
                }
            }
            System.out.println(result);
        }


    }
}
