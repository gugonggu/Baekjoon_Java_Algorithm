import java.util.Scanner;

public class Boj2480 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split((" "));

        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);
        int num3 = Integer.parseInt(nums[2]);

        if (num1 == num2 && num2 == num3) {
            System.out.print(10000 + num1 * 1000);
        } else if (num1 == num2 || num2 == num3 || num3 == num1) {
            int max;
            if (num1 == num2) {
                max = num1;
            } else if (num2 == num3) {
                max = num2;
            } else {
                max = num3;
            }
            System.out.print(1000 + max * 100);
        } else {
            int temp = Math.max(num1, num2);
            int max = Math.max(temp, num3);
            System.out.print(max * 100);
        }
    }
}
