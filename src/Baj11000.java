import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Baj11000 {

    static class Lesson implements Comparable<Lesson> {

        int start;
        int end;

        public Lesson(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Lesson o) {
            if (this.start == o.start) {
                return this.end - o.end;
            }
            return this.start - o.start;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Lesson> lessons = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            lessons.add(new Lesson(start, end));
        }

        Collections.sort(lessons);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (Lesson le : lessons) {
            int end = le.end;
            if (!pq.isEmpty() && pq.peek() <= le.start) {
                pq.poll();
            }
            pq.offer(end);
        }

        System.out.println(pq.size());
    }

}
