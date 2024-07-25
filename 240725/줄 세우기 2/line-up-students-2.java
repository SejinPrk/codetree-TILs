import java.util.*;

class Student implements Comparable<Student> { 
    int height;
    int weight;
    int number;

    Student(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student other) {
        if (this.height != other.height) {
            return Integer.compare(this.height, other.height); 
        } else {
            return Integer.compare(other.weight, this.weight); // 값으로 비교
        }
    }
}
    
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 학생 수

        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students.add(new Student(height, weight, i));
        }

        Collections.sort(students);

        // 결과 출력
        for (Student student : students) {
            System.out.println(student.height + " " + student.weight + " " + student.number);
        }

        sc.close();
    }
}