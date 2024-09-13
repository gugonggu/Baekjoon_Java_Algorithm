import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Baj1417 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int num = sc.nextInt();
        int dasom = sc.nextInt();
        int count = 0;

        for (int i = 0; i < num - 1; i++) {
            pq.offer(sc.nextInt());
        }

        if(pq.peek() != null){
            while (pq.peek() >= dasom) {
                int top = pq.poll();
                pq.offer(top - 1);
                dasom++;
                count++;
            }
        }

        System.out.println(count);
    }
}
