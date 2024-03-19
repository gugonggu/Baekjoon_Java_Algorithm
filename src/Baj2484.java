import java.util.Arrays;
import java.util.Scanner;

public class Baj2484 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] prices = new int[N];

        for (int i = 0; i < N; i++) {
            int[] nums = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};

            Arrays.sort(nums);
            if (nums[0] == nums[3]) {
                prices[i] = 50000 + nums[0] * 5000;
            } else if (nums[0] == nums[2] || nums[1] == nums[3]) {
                prices[i] = 10000 + nums[1] * 1000;
            } else if (nums[0] == nums[1] && nums[2] == nums[3]) {
                prices[i] = 2000 + nums[0] * 500 + nums[2] * 500;
            } else if (nums[0] == nums[1]) {
                prices[i] = 1000 + nums[0] * 100;
            } else if (nums[1] == nums[2]) {
                prices[i] = 1000 + nums[1] * 100;
            } else if (nums[2] == nums[3]) {
                prices[i] = 1000 + nums[2] * 100;
            } else {
                prices[i] = nums[3] * 100;
            }
        }

        Arrays.sort(prices);

        System.out.println(prices[N - 1]);
    }
}
