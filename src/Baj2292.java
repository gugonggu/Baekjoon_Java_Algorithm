import java.util.Scanner;

public class Baj2292 {

    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();

        int pass = 1;
        int rooms = 2;

        while (rooms <= N) {
            rooms += 6 * pass;
            pass++;
        }

        System.out.println(pass);
    }
}
