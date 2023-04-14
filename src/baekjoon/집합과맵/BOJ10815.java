package baekjoon.집합과맵;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ10815 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, m;
    static int arr[];

    public static void answer() throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < n; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        // 숫자 카드 오름차순 정렬
        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(set.contains(num)) bw.write("1 ");
            else bw.write("0 ");
        }

        bw.close();
        br.close();
    }



}