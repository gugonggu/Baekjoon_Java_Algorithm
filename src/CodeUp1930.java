import java.util.Scanner;

public class CodeUp1930 {

    public static int superSum(int k, int n) {
        if (k == 0) {
            return n;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += superSum(k - 1, i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(superSum(k, n));
        }
    }

}
