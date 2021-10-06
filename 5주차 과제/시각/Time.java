package 시각;
import java.util.*;

public class Time {
    public static boolean check(int n, int m, int s) {
        if (n % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i <= n; i++) { // 시
            for (int j = 0; j < 60; j++) { // 분
                for (int k = 0; k < 60; k++) { // 초
                    if (check(i, j, k)) cnt++;
                }
            }
        }
        
        System.out.println(cnt);
    }    
}
