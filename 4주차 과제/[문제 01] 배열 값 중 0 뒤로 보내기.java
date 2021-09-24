import java.util.*;

class Solution {
    public static void reorder(int[] arr) {
        int j = 0;
        for(int item : arr) {
            if(item != 0) {
                arr[j] = item;
                j++; 
            }
        }
        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열에 입력할 숫자의 갯수
        int[] arr = new int[n];
        for(int i=0; i<n; i++) { // 배열에 숫자 입력
            arr[i] = sc.nextInt();
        }

        reorder(arr);
        System.out.println(Arrays.toString(arr));
    }
}