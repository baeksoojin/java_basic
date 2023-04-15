package baekjoon.solvedac.class1;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1157 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, new Integer(0));

        for(int i=0; i<text.length(); i++){
            int check = text.charAt(i) >=97 ? text.charAt(i)-97 : text.charAt(i)-65;
            alphabet[check] +=1;
        }

        int max=-1;
        int maxSame =0;
        int maxIndex = -1;
        for(int i=0; i<alphabet.length; i++){
            if(max < alphabet[i]){
                max = alphabet[i];
                maxIndex = i;
                maxSame=0;
            }else if(max == alphabet[i]){
                maxSame+=1;
            }

        }

        char result = (maxSame == 0) ? (char)(maxIndex+65) : '?';
        System.out.println(result);

    }
}
