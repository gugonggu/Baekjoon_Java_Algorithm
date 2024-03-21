import java.util.Scanner;

public class Baj1356 {

    public static int calc(String m) {
        int temp = 1;
        for (int i = 0; i < m.length(); i++) {
            temp = temp * (m.charAt(i) - '0');
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int len = n.length();

        String ans = "NO";
        for (int i = 0; i < len - 1; i++) {
            String front = n.substring(0, i + 1);
            String back = n.substring(i + 1, len);
            int val1 = calc(front);
            int val2 = calc(back);

            if(val1 == val2){
                ans = "YES";
                break;
            }
        }

        System.out.println(ans);
    }
}
