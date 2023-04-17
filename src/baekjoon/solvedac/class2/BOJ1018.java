package baekjoon.solvedac.class2;

import java.util.Scanner;

/**
 * 체스판의 경우는 총 2가지 -> W로 시작할때와 B로 시작할때의 경우에 다시 칠해야하는 정사각형의 개수를 구하고 비교
 */
public class BOJ1018 {

    public static char[][] board;
    public static int answer;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int m = sc.nextInt();

        board = new char[n][m];
        //board 초기화
        for (int i = 0; i < n; i++){
            String m_list = sc.next();
            for (int j = 0; j < m; j++){
                board[i][j] = m_list.charAt(j);
            }
        }

        // 경우의 수 구해서 체크
        int checkN = n - 8 + 1;
        int checkM = m - 8 + 1;
        answer = 99999999;
        for (int i = 0; i < checkN; i++) {
            for (int j = 0; j < checkM; j++) {
                getWrongCount(i, j);
            }
        }
        System.out.println(answer);
    }

    public static void getWrongCount(int x, int y){

        int endX = x + 8;
        int endY = y + 8;

        char startB = 'B';
        char startW = 'W';

        int countB = 0;
        int countW = 0;

        for (int i = x; i < endX; i++){
            for (int j = y; j < endY; j++) {

                //첫번째가 B일때의 8*8보트의 경우에서 다른 경우의 칸을 체크
                if (board[i][j] != startB) {
                    countB++;
                }
                //첫번째가 W일때의 8*8보트의 경우에서 다른 경우의 칸을 체크
                if (board[i][j] != startW) {
                    countW++;
                }
                if ( j != endY - 1 ){
                    startB = startB == 'B' ? 'W' : 'B'; //swap
                    startW = startW == 'B' ? 'W' : 'B'; //swap
                }
            }
        }

        int min = countB > countW ? countW : countB;

        answer = answer > min ? min : answer;
    }
}
