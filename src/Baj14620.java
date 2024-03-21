import java.util.Arrays;
import java.util.Scanner;

public class Baj14620 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] prices = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                prices[i][j] = sc.nextInt();
            }
        }

        int[][] possiblePrices = new int[n-2][n-2];

        for (int i = 0; i < n - 2; i++){
            for(int j = 0; j < n - 2; j++){
                possiblePrices[i][j] = prices[i+1][j] + prices[i][j+1] + prices[i+1][j+1] + prices[i+2][j+1] + prices[i+2][j+2];
            }
        }

        System.out.println(Arrays.deepToString(prices));
        System.out.println(Arrays.deepToString(possiblePrices));

        int answer = 0;

        int prevMinValue = 0;
        int[][] prev = new int[3][3];
        for(int i = 0; i < 3; i++){
            int minX = 0;
            int minY = 0;
            int minValue = 0;

            for(int j = 0; j < n - 2; j++){
                for(int k = 0; k < n - 2; k++){
                    if(possiblePrices[i][j] < minValue){
                        minX = j;
                        minY = i;
                        minValue = possiblePrices[i][j];
                    }
                }
            }

            prev[i][0] = minX;
            prev[i][1] = minY;
            prev[i][2] = minValue;

            System.out.println(minX);
            System.out.println(minY);
        }
    }
}
