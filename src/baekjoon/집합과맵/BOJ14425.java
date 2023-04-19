package baekjoon.집합과맵;

import java.util.HashSet;
import java.util.Scanner;

public class BOJ14425 {

    public static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.nextLine();

        HashSet<String> setN = new HashSet<>();
        for(int i=0; i<n; i++){
            setN.add(sc.nextLine());
        }
        for(int i=0; i<m; i++){
            String tempStr = sc.nextLine();
            if(setN.contains(tempStr)){
                count++;
            }
        }

        System.out.println(count);
    }
}
