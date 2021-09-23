import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] time = new int[N];

        for(int i=0; i < N; i++) {
            time[i] = sc.nextInt();
        }

        Arrays.sort(time);
        sc.close();

        int accumulate = 0;
        int answer = 0;

        for(int j=0; j < N; j++) {
            answer += accumulate + time[j];
            accumulate += time[j];
        }

        System.out.println(answer);
    }
}