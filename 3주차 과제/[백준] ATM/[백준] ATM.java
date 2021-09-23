import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // ATM 기기를 사용하기 위해 기다리는 사람 수
        int[] time = new int[N];

        for(int i=0; i < N; i++) {
            time[i] = sc.nextInt(); // 각각이 ATM을 사용하는데 소모되는 시간
        }

        Arrays.sort(time); // 작은 수 부터 정렬
        sc.close();

        int accumulate = 0; // 누적값
        int answer = 0; 

        for(int j=0; j < N; j++) {
            answer += accumulate + time[j];
            accumulate += time[j];
        }

        System.out.println(answer);
    }
}