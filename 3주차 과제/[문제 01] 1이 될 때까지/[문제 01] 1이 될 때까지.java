import java.util.*;
 
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();  
		int K = sc.nextInt();
        sc.close();
        int result = 0;

        while(true) {
            int target = (N / K) * K; // K로 N을 나눌 때, 나누어 떨어지는 가장 큰 수
            result += (N - target); // K를 N으로 나눌 때 나머지 값
            N = target;
            
            // N이 K보다 작으면 더 이상 나눌 수 없음, 반복문 탈출 
            if(N < K) break;

            result += 1;
            N /= K;
        }

        result += (N - 1);
        System.out.println(result);
    }
}