import java.util.*;
 
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        sc.close();

        long result = data.charAt(0) - '0';
        for (int i = 1; i < data.length(); i++){
            int num = data.charAt(i) - '0';
            if (num <= 1 || result <= 1) {
                result += num;
            } else {
                result *= num;
            }
        }
        System.out.println(result);
    }
}