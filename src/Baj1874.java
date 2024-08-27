import java.util.Scanner;
import java.util.Stack;

public class Baj1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        int n = sc.nextInt();
        int start = 0;

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();

            if(num > start) {
                for(int j = start + 1; j <= num; j++){
                    stack.push(j);
                    ans.append("+\n");
                }
                start = num;
            } else if (stack.peek() != num) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            ans.append("-\n");
        }

        System.out.println(ans);
    }
}
