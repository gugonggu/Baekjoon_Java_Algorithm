import java.util.Scanner;

public class Baj2798 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] cards = new int[N];
        input = sc.nextLine().split(" ");

        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(input[i]);
        }

        int max = 0;
        for (int i = 0; i < N - 2; i++) {
            for(int j = i+1; j < N - 1; j++){
                for(int k = j+1; k < N; k++){
                    int sum = cards[i] + cards[j] + cards[k];
                    if(sum <= M){
                        if(max < sum){
                            max = Math.max(max, sum);
                        }
                    }
                }
            }
        }

        System.out.println(max);
    }
}
