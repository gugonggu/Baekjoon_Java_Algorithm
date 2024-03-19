import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;

    }


    @Override
    public int compareTo(Student o) {
        /*if (this.age > o.age) {
            return 1;
        } else if (this.age == o.age) {
            return 0;
        } else {
            return -1;
        }*/
        // return this.age - o.age; // 오름차순
        return o.age - this.age;
    }
}

public class Main {

    public static void main(String[] args) {
        Student a = new Student(10, "A");
        Student b = new Student(20, "B");
        Student c = new Student(30, "C");
        Student d = new Student(40, "D");

        ArrayList<Student> students = new ArrayList<>();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);

        Collections.sort(students);
        for(Student student : students) {
            System.out.println(student.age + " " + student.name);
        }
    }
}