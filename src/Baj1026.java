import java.util.Arrays;
import java.util.Scanner;

public class Baj1026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");
        String[] str2 = sc.nextLine().split(" ");

        Integer[] A = new Integer[n];
        Integer[] B = new Integer[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(str[i]);
            B[i] = Integer.parseInt(str2[i]);
        }

        Arrays.sort(A);
        Arrays.sort(B, (o1, o2) -> o2 - o1);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i] * B[i];
        }
        System.out.println(sum);
    }
}
