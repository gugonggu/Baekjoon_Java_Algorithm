import java.util.Scanner;

public class Baj2914 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] nums = input.split(" ");
        int songNum = Integer.parseInt(nums[0]);
        int average = Integer.parseInt(nums[1]);

        int melody = 1;
        while (Math.ceil((double) melody / songNum) != average){
            melody++;
        }
        System.out.println(melody);
    }
}
