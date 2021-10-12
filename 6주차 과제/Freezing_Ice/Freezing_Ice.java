package Freezing_Ice;
import java.util.*;

public class Freezing_Ice {
    public static int n, m; // 세로, 가로
    public static int [][] graph = new int[1000][1000];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        scanner.nextLine(); // Enter를 치기 전까지 쓴 문자열을 모두 리턴, 버퍼 삭제

        for(int i=0; i<n; i++) {
            String str = scanner.nextLine();
            for(int j=0; j<m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }
        scanner.close();

        int result = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(dfs(i, j)){
                    result+=1;
                }
            }
        }

        System.out.println(result);
    }

    public static boolean dfs(int x, int y) {
        if(x <= -1 || x>= n || y <= -1 || y >= m) return false;

        if(graph[x][y] == 0) {
            graph[x][y] = 1; // 해당 노드 방문 처리
            dfs(x -1, y); // 인접 노드 (상, 하, 좌, 우) 방문 처리
            dfs(x, y -1);
            dfs(x + 1, y );
            dfs(x, y + 1);
            return true;
        }

        return false;
    }
}
