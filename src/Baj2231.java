import java.util.Scanner;

public class Baj2231 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int NLength = (int) (Math.log10(N) + 1);

        for (int i = N - NLength * 9; i <= N; i++) {
            int num = i;
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }

            if(sum + i == N){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
