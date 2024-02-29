import java.util.Arrays;
import java.util.Scanner;

public class Baj11501 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            sc.nextLine();

            String[] input = sc.nextLine().split(" ");

            int[] prices = new int[n];
            for(int j = 0; j < n; j++) {
                prices[j] = Integer.parseInt(input[j]);
            }
            int profit = 0;

            for(int j = 0; j < n; j++){
                if(prices[j] == Arrays.stream(Arrays.copyOfRange(prices, j, prices.length)).max().getAsInt()){

                }
                System.out.println(profit);
            }
            System.out.println(profit);
        }
    }
}
