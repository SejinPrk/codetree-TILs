import java.util.Scanner;

public class Main {

    //  M월 D일이 존재하는지를 판단하는 함수
    public static String isValidDate(int M, int D) {
        // 각 달의 일수를 저장한 배열 (0번 인덱스는 사용하지 않음)
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // M이 1 이상 12 이하인지 확인
        if (1 <= M && M <= 12) {
            // D가 해당 달의 일수 내에 있는지 확인
            if (1 <= D && D <= daysInMonth[M]) {
                return "Yes";
            } else {
                return "No";
            }
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // M, D 입력
        int M = sc.nextInt();
        int D = sc.nextInt();

        // 결과 출력
        System.out.println(isValidDate(M, D));
        sc.close();
    }
}