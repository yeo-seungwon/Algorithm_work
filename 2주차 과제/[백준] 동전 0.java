import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);

		// 가지고 있는 동전의 종류 N / 동전 금액의 합 K
		int N = sc.nextInt();  
		int K = sc.nextInt();
		
		int[] coin = new int[N];
		
		for(int i = 0; i < N; i++) { // 가지고 있는 동전의 종류 coin 리스트에 삽입
			coin[i] = sc.nextInt();
		}
		
		int count_c = 0;
		// 사용되는 동전의 수 만큼 count
		for(int i = N - 1; i >= 0; i--) {
			if(coin[i] <= K) {
				count_c += (K / coin[i]);
				K = K % coin[i];
			}
		}
		System.out.println(count_c);
	}
 
}