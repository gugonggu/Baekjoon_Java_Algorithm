import java.util.Scanner;

public class Baj5532 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vacation = sc.nextInt();
        int totalKorean = sc.nextInt();
        int totalMath = sc.nextInt();
        int koreanPerDay = sc.nextInt();
        int mathPerDay = sc.nextInt();

        int koreanDays = (int) Math.ceil((double) totalKorean / koreanPerDay);
        int mathDays = (int) Math.ceil((double) totalMath / mathPerDay);

        System.out.println(vacation - Math.max(mathDays, koreanDays));
    }

}
