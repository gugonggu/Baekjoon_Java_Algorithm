import java.util.Scanner;

public class CodeUp1928 {

    public static void func(int n) {
        if (n == 1) {
            System.out.println(1);
        } else {
            if (n % 2 == 0) {
                System.out.println(n);
                func(n / 2);
            } else {
                System.out.println(n);
                func(3 * n + 1);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        func(sc.nextInt());
    }
}
