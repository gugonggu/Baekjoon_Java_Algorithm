import java.util.Arrays;
import java.util.Scanner;

public class Baj9366 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String[] ans = new String[T];
        int[] arr = new int[3];
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);

            String result;
            if (arr[2] >= arr[0] + arr[1]) {
                result = "invalid!";
            } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
                result = "equilateral";
            } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
                result = "isosceles";
            } else {
                result = "scalene";
            }

            ans[i] = "Case #" + (i + 1) + ": " + result;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
