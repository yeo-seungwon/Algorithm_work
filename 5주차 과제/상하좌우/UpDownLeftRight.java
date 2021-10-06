package 상하좌우;
import java.util.*;

public class UpDownLeftRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 공간의 크기 : ");
        int n = sc.nextInt(); // 공간의 크기
        System.out.print("이동 계획 횟수 : ");
        int c = sc.nextInt(); // 이동 계획 횟수
        System.out.print("이동 계획 : ");
        String[] plan = new String[c]; // 이동 계획
        for(int i = 0; i < c; i++){
            plan[i] = sc.next();
        }
        int x = 1;
        int y = 1;

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        String[] move_types = {"L", "R", "U", "D"};

        int nx = 0;
        int ny = 0;
        for(int i = 0; i < plan.length; i++){
            for(int j = 0; j < move_types.length; j++){
                if(plan[i].equals(move_types[j])){
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if(nx < 1 || ny < 1 || nx > n || ny > n){
                continue;
            }
            x = nx;
            y = ny;
        }
        System.out.println("최종 위치 : " + x + " " + y);
    }
}