import java.util.Scanner;

public class Baj11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String[] input = sc.nextLine().split("");
        int ans = 0;

        for (int i = 0; i < N; i++) {
            ans += Integer.parseInt(input[i]);
        }

        System.out.println(ans);
    }
}
