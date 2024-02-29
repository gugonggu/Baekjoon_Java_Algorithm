import java.util.Scanner;

public class baj15726 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numString = sc.nextLine();
        String[] nums = numString.split(" ");
        double num1 = Double.parseDouble(nums[0]);
        double num2 = Double.parseDouble(nums[1]);
        double num3 = Double.parseDouble(nums[2]);
        double exp = num1 * num2 / num3;
        double exp2 = num1 / num2 * num3;
        System.out.print((int) Math.max(exp, exp2));
    }
}
