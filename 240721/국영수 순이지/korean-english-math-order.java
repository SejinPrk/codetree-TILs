import java.util.*;
class Student implements Comparable<Student> {
    String name;
    int korean;
    int english;
    int math;

    Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override 
    public int compareTo(Student other) {
        if (this.korean != other.korean) {
            return other.korean - this.korean;
        } else if (this.english != other.english) {
            return other.english - this.english;
        } else {
            return other.math - this.math;
        }
    }

    @Override
    public String toString() {
        return name + " " + korean + " " + english + " " + math;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            int korean = Integer.parseInt(input[1]);
            int english = Integer.parseInt(input[2]);
            int math = Integer.parseInt(input[3]);
    
            students.add(new Student(name, korean, english, math));
        }

        Collections.sort(students);

        for(Student student : students) {
            System.out.println(student);
        }

        sc.close();
    }
}