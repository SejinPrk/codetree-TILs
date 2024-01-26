import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score =  0;
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < 8; i++) {
            score = sc.nextDouble();
            sum += score;
        }
        avg = sum / 8;
        System.out.printf("%.1f\n", avg);
    }
}