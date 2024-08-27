import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Baj1158 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        Queue<Integer> result = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            result.offer(i);
        }

        ans.append("<");
        while (result.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                result.offer(result.poll());
            }
            ans.append(result.poll()).append(", ");
        }
        ans.append(result.poll()).append(">");

        System.out.println(ans);
    }
}
