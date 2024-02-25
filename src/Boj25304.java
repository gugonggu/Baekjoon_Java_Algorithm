import java.util.Scanner;

public class Boj25304 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPrice = sc.nextInt();
        int total = sc.nextInt();

        sc.nextLine();

        int compare = 0;

        for (int i = 0; i < total; i++) {
            String line = sc.nextLine();
            String[] lineSplit = line.split(" ");
            compare += Integer.parseInt(lineSplit[0]) * Integer.parseInt(lineSplit[1]);
        }

        System.out.println(totalPrice == compare ? "Yes" : "No");
    }
}
