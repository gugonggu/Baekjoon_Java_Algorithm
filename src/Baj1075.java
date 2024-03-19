import java.util.Scanner;

public class Baj1075 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("");
        input[input.length - 1] = "0";
        input[input.length - 2] = "0";
        int N = Integer.parseInt(String.join("", input));
        int F = sc.nextInt();

        for (int i = 0; i < 100; i++) {
            if (N % F == 0) {
                if (i < 10) {
                    System.out.printf("0%d\n", i);
                } else {
                    System.out.println(i);
                }
                break;
            } else {
                N++;
            }
        }
    }
}
