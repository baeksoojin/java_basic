package baekjoon.집합과맵;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class BOJ10815 {

    public static void bs(int s, int e, int target, int[] n_list){
        if(s>e){
            System.out.printf("0 ");
            return;
        }

        int mid = (s+e)/2;

        if(n_list[mid] > target){
            bs(s, e-1, target, n_list);
        } else if (n_list[mid] < target) {
            bs(s+1, e, target, n_list);
        }else{
            System.out.printf("1 ");
            return;
        }


    }

    public static void answer(){
        int n, m;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] n_list = new int[n];
        for(int i=0; i<n; i++){
            n_list[i] = sc.nextInt();
        }

        Arrays.sort(n_list);

        m = sc.nextInt();
        for(int i=0; i<m; i++){
            bs(0,n-1, sc.nextInt(), n_list);
        }
    }


}