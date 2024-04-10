import java.util.Scanner;

public class CodeUp1904 {

    public static void func(int n, int k) {
        if (n > k) {
            return;
        } else {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
            func(n + 1, k);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        func(n, k);
    }
}
