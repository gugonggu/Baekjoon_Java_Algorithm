import java.util.Scanner;

public class Baj11050 {

    public static int binoCoe(int n, int r) {
        if (r == n || r == 0) {
            return 1;
        } else {
            return binoCoe(n - 1, r - 1) + binoCoe(n - 1, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binoCoe(n, r));
    }
}
