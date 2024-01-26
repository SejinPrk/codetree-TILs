import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double score[] = new double[100];
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextDouble();
            sum += score[i];
        }
        avg = sum / n;
        System.out.printf("%.1f\n", avg);

        if(avg >= 4.0) {
            System.out.println("Perfect");
        } else if (avg >= 3.0) {
            System.out.println("Good");
        } else {
            System.out.println("Poor");
        }
    }
}