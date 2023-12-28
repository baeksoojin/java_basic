package baekjoon.그래프;

import java.util.PriorityQueue;
import java.util.Scanner;

// 노드, 간선이 입력되고
// a,b,cost 로 여러 줄이 입력

    /**
     * 0번 노드에서 갈 수 있는 최소경로를 노드 순서대로 입력
     */

    public class BOJ1504 {
    static final int INF = 999999999;
    static final int MAX_N = 10;
    static int N,E;
    static int[][] Graph = new int[MAX_N][MAX_N]; //인접행렬
    static int[] Distance = new int[MAX_N];

    static void dijkstra(int n){

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);//우선순위 큐를 활용해서

        boolean[] visited = new boolean[MAX_N];

        for(int i=0; i<N; i++){
            Distance[i] = INF;
        }

        Distance[n] = 0;
        pq.add(new int[]{0, n});

        while(!pq.isEmpty()){
            int[] current = pq.poll();//최소 list를 반환
            int current_node = current[1]; //정점
            if(visited[current_node] == false){
                visited[current_node] = true;

                for(int temp=1; temp<N+1; temp++){
                    if(Distance[temp] > Distance[current_node] + Graph[current_node][temp]){
                        Distance[temp] = Distance[current_node] + Graph[current_node][temp];
                        pq.add(new int[] {Distance[temp],temp});
                    }
                }
            }

        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); //노드
        E = sc.nextInt(); //간선

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(i==j) Graph[i][j] = 0;
                else    Graph[i][j] = INF;
            }
        }

        for(int i=0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int cost = sc.nextInt();
            Graph[u][v] = Graph[v][u] = cost;
        }

        dijkstra(0);

        for(int i=0; i<N; i++){
            System.out.println( Distance[i] );
        }


    }
}