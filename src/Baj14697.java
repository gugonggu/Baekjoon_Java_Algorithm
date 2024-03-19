import java.util.Scanner;

public class Baj14697 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rooms = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int students = sc.nextInt();

        for (int i = 2; i >= 0; i--) {
            students = students % rooms[i];
        }

        if (students == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
