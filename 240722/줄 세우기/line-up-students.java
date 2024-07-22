import java.util.*;
class Student implements Comparable<Student> {
    int h, w, num;

    public Student(int h, int w, int num) {
        this.h = h;
        this.w = w;
        this.num = num;
    }

    @Override
    public int compareTo(Student student) {
        if (this.h != student.h) { 
            return student.h - this.h; // 키가 큰 순서대로
        } else if (this.w != student.w) {
            return student.w - this.w; // 몸무게가 큰 순서대로
        } else {
            return this.num - this.num; // 번호가 작은 순서대로
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            students[i] = new Student(h, w, i+1);
        }

        Arrays.sort(students);

        for (Student s : students) {
            System.out.println(s.h + " " + s.w + " " + s.num);
        }

        sc.close();
    }
}