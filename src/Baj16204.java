import java.util.Scanner;

public class Baj16204 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);

        int oCard = m;
        int xCard = n - m;

        int drawO = k;
        int drawX = n - k;

        int o = oCard > drawO ? drawO : oCard;
        int x = xCard > drawX ? drawX : xCard;

        System.out.println(o + x);
    }
}
