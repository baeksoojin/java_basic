package baekjoon.solvedac.class2;

import java.util.Scanner;

public class BOJ1259 {

    /**
     * java에서 equal과 == 차이 주의
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            String input = sc.nextLine().trim();
            if(input.equals("0")){
                break;
            }else{
                boolean isPal = true;
                for(int i=0; i<input.length()/2; i++){
                    char c = input.charAt(i);
                    isPal = c == input.charAt(input.length() - i - 1) ? true : false;
                    if(isPal == false){
                        System.out.println("no");
                        break;
                    }
                }
                if( isPal == true) {
                    System.out.println("yes");
                }
            }
        }
    }
}
