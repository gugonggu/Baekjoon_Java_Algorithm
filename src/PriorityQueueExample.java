import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    static class Student {

        int grade;
        int number;

        public Student(int grade, int number) {
            this.grade = grade;
            this.number = number;
        }
    }

    static class StudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.grade == o2.grade) {
                return o1.number - o2.number;
            }
            return o2.grade - o1.grade;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(4);
        pq.offer(6);
        pq.offer(1);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        System.out.println("====================================");

        PriorityQueue<Integer> reversePq = new PriorityQueue<>(Collections.reverseOrder());
        reversePq.offer(4);
        reversePq.offer(6);
        reversePq.offer(1);

        while (!reversePq.isEmpty()) {
            System.out.println(reversePq.poll());
        }

        System.out.println("====================================");

        PriorityQueue<Student> studentPq = new PriorityQueue<>(1, new StudentComparator());

        studentPq.offer(new Student(1, 10));
        studentPq.offer(new Student(3, 5));
        studentPq.offer(new Student(3, 2));

        while (!studentPq.isEmpty()) {
            Student student = studentPq.poll();
            System.out.println("grade: " + student.grade + ", number: " + student.number);
        }
    }

}
