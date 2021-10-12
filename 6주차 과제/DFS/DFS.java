package DFS;
import java.util.*;

public class DFS {
    public static boolean[] visited = new boolean[9];
    static int[][] graph = {{}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7}};

    // DFS 함수 정의
    public static void dfs(int x) {
        visited[x] = true;
        System.out.print(x + " ");

        for (int node : graph[x]) { // for (타입 변수명 : 배열 또는 컬랙션)
            if (!visited[node]) {
                dfs(node);
            }
        }
    }

    public static void main(String[] args) {
        dfs(1); // 1번 노드에서 시작
    }
}
