package BFS;

import java.util.*;

public class BFS {
    public static boolean[] visited = new boolean[9];
    public static int[][] graph = {{}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7}};

    public static void bfs(int start) {
        // LinkedList는 각각의 노드를 연결하는 방식, 양방향 연결 리스트로 구현
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()){
            // 큐에서 가장 처음에 입력된 원소를 뽑아 출력
            int x = q.poll(); 
            System.out.print(x + " ");

            for(int node : graph[x]) {
                if(!visited[node]) {
                    q.offer(node);
                    visited[node] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bfs(1); // 1번 노드에서 시작
    }
}
