import java.util.Scanner;

public class Baj9095 {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n == 3) {
            return 4;
        } else {
            return sum(n - 1) + sum(n - 2) + sum(n - 3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(sum(n));
        }
    }
}
