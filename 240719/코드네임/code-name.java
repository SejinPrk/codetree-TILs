import java.util.Scanner;

class Student {
    int kor, eng, math;

    public Student() {
        this.kor = 0;
        this.eng = 0;
        this.math = 0;
    }

    public Student(int kor, int eng, int math){
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        Student[] students = new Student[5];
        for(int i = 0; i < 5; i++) {
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            students[i] = new Student(kor, eng, math);
        }

        Student student3 = students[2];    // 세 번째 학생 정보
        System.out.print("student3: ");
        System.out.print(student3.kor + " ");
        System.out.print(student3.eng + " ");
        System.out.print(student3.math + " ");
    }
}