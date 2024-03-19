import java.util.Scanner;

public class Baj11501 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long[] ans = new long[t];

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            long[] prices = new long[n];
            for (int j = 0; j < n; j++) {
                prices[j] = sc.nextInt();
            }

            long max = 0;
            for (int j = prices.length - 1; j >= 0; j--) {
                if (prices[j] > max) {
                    max = prices[j];
                } else {
                    ans[i] += max - prices[j];
                }
            }
        }
        for(int i = 0; i < t; i++) {
            System.out.println(ans[i]);
        }
    }
}
