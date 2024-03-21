import java.util.Scanner;

public class Baj2503 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] nums = new boolean[988];
        int n = sc.nextInt();

        for (int i = 123; i < 988; i++) {
            String num = Integer.toString(i);

            if (num.charAt(0) == '0' || num.charAt(1) == '0' || num.charAt(2) == '0') {
                continue;
            }
            if (num.charAt(0) == num.charAt(1) || num.charAt(0) == num.charAt(2)
                    || num.charAt(1) == num.charAt(2)) {
                continue;
            }

            nums[i] = true;
        }

        for (int i = 0; i < n; i++) {
            int predict = sc.nextInt();
            int strike = sc.nextInt();
            int ball = sc.nextInt();

            for (int j = 123; j < 988; j++) {
                if (nums[j]) {
                    int possibleStrike = 0;
                    int possibleBall = 0;

                    for (int pre = 0; pre < 3; pre++) {
                        char preChar = Integer.toString(predict).charAt(pre);
                        for (int num = 0; num < 3; num++) {
                            char numChar = Integer.toString(j).charAt(num);

                            if (preChar == numChar && pre == num) {
                                possibleStrike++;
                            } else if (preChar == numChar && pre != num) {
                                possibleBall++;
                            }
                        }
                    }

                    if (strike == possibleStrike && ball == possibleBall) {
                        nums[j] = true;
                    } else {
                        nums[j] = false;
                    }
                }
            }
        }

        int answer = 0;
        for (int i = 123; i < 988; i++) {
            if (nums[i]) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
