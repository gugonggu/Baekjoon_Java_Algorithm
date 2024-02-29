import java.util.Scanner;

public class Baj2897 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        char[][] parkingLot = new char[row][col];

        for (int i = 0; i < row; i++) {
            String line = sc.nextLine();
            parkingLot[i] = line.toCharArray();
        }

        int clear = 0;
        int breakOne = 0;
        int breakTwo = 0;
        int breakThree = 0;
        int breakFour = 0;

        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < col - 1; j++) {
                if (parkingLot[i][j] == '#' || parkingLot[i][j + 1] == '#'
                        || parkingLot[i + 1][j] == '#' || parkingLot[i + 1][j + 1] == '#') {
                    continue;
                }

                int carCount = 0;
                if (parkingLot[i][j] == 'X') {
                    carCount++;
                }
                if (parkingLot[i][j + 1] == 'X') {
                    carCount++;
                }
                if (parkingLot[i + 1][j] == 'X') {
                    carCount++;
                }
                if (parkingLot[i + 1][j + 1] == 'X') {
                    carCount++;
                }

                if (carCount == 0) {
                    clear++;
                } else if (carCount == 1) {
                    breakOne++;
                } else if (carCount == 2) {
                    breakTwo++;
                } else if (carCount == 3) {
                    breakThree++;
                } else {
                    breakFour++;
                }
            }
        }

        System.out.println(clear);
        System.out.println(breakOne);
        System.out.println(breakTwo);
        System.out.println(breakThree);
        System.out.println(breakFour);
    }
}
