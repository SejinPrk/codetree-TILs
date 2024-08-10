import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[] penaltyCnt = new int[N + 1]; // 각 학생의 벌칙 횟수
         
        for (int i = 0; i < M; i++) {
            int studentNo = sc.nextInt();
            penaltyCnt[studentNo]++;

            if (penaltyCnt[studentNo] >= K) {
                System.out.println(studentNo);
                sc.close();
                return;
            }
        }

        // 벌금 내는 학생이 없는 경우
        System.out.println(-1);
        sc.close();
    }
}