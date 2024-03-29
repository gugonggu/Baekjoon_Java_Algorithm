import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baj2822 {

    public static void main(String[] args) {
        Integer[] scores = new Integer[8];
        Integer[] copied = new Integer[8];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            int v = sc.nextInt();
            scores[i] = copied[i] = v;
        }

        Arrays.sort(copied, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int[] nums = new int[5];
        int total = 0;
        for(int i = 0; i < 5; i++){
            total += copied[i];
            for(int j = 0; j < scores.length; j++){
                if(copied[i] == scores[j]){
                    nums[i] = j + 1;
                    break;
                }
            }
        }
        Arrays.sort(nums);
        System.out.println(total);
        for(int i = 0; i < 5; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
