package algorithm.chapter1;

import java.util.Scanner;

/**
 *a,b,c를 입력받아서 최댓값을 출력
 */
public class Max3 {

    public static int SIZE = 3;
    public static int MAX_TEMP = -99999;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] array = new int[3];
        for(int i=0; i<SIZE; i++){
            array[i] = sc.nextInt();
        }

        int max = MAX_TEMP;
        for(int i=0; i<SIZE; i++){
            if(max <= array[i]){
                max = array[i];
            }
        }

        System.out.println("3개 중에서 최댓값은 :"+ max);

    }
}
