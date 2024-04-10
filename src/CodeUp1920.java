import java.util.Scanner;

public class CodeUp1920 {

    public static void toBinary(int n) {
        if (n < 1) {
            return;
        }
        toBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0){
            toBinary(n);
        } else {
            System.out.print(0);
        }
    }
}
