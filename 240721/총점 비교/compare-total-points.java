import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int score1, score2, score3;
    int total;

    public Student(String name, int score1, int score2, int score3){
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.total = score1 + score2 + score3;
    }

    @Override
    public int compareTo(Student other) {  
        return this.total - other.total;
    }

    @Override
    public String toString() {
        return name + " " + score1 + " " + score2 + " " + score3;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Student> students = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            int score1 = Integer.parseInt(input[1]);
            int score2 = Integer.parseInt(input[2]);
            int score3 = Integer.parseInt(input[3]);
            students.add(new Student(name, score1, score2, score3));
        }

        Collections.sort(students);

        for(Student student : students) {
            System.out.println(student);
        }

        sc.close();
    }
}