import java.util.Scanner;

public class Baj14697 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int num = sc.nextInt();

        boolean canSeparate = false;

        for (int i = 0; i <= num / a; i++) {
            for (int j = 0; j <= num / b; j++) {
                for (int k = 0; k <= num / c; k++) {
                    if (i * a + j * b + k * c == num) {
                        canSeparate = true;
                        break;
                    }
                }
            }
        }

        if (canSeparate) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
