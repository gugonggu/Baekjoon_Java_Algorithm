import java.util.Arrays;
import java.util.Scanner;

public class Baj2309 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int[] nums = new int[9];
        for (int i = 0; i < 9; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - nums[i] - nums[j] == 100) {
                    nums[i] = 0;
                    nums[j] = 0;
                    Arrays.sort(nums);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(nums[k]);
                    }
                    return;
                }
            }
        }
    }
}
