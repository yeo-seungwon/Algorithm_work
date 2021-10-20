import java.io.*;
import java.util.*;

public class MazeBfs {
    public static int N, M;
    public static int [][] graph = new int [200][200];

    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("미로의 가로 길이 : ");
        N = scanner.nextInt();
        System.out.print("미로의 세로 길이 : ");
        M = scanner.nextInt();
        scanner.nextLine(); // 버퍼 지우기

        for(int i = 0; i < N; i++) {
            String str  = scanner.nextLine();
            for(int j = 0; j < M; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        scanner.close();
        System.out.println("result : " + bfs(0, 0));
    }

    public static int bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y));

        while(!queue.isEmpty()) {
            Node node = queue.poll();
            x = node.getX();
            y = node.getY();

            for(int i = 0; i < 4; i++) { // 상하좌우 움직임
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if(graph[nx][ny] == 0) continue;

                if(graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    queue.add(new Node(nx, ny));
                }
            }
        }

        return graph[N - 1][M - 1];
    }

    static class Node {
        final private int x;
        final private int y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() { return x; }
        public int getY() { return y; }
    } 
}