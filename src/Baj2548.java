import java.util.Arrays;
import java.util.Scanner;

public class Baj2548 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);

        if (n % 2 == 0) {
            System.out.println(arr[n / 2 - 1]);
        } else {
            System.out.println(arr[n / 2]);
        }
    }
}
