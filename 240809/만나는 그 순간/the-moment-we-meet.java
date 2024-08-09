import java.util.Scanner;

public class Main {
    private static int findMeetingTime(int[][] moveA, int[][] moveB) {
        int posA = 0, posB = 0; // A, B의 현재 위치
        int timeA = 0, timeB = 0; // A, B의 총 이동시간
        int indexA = 0, indexB = 0; // A, B의 현재 이동 인덱스

        // A, B의 모든 이동을 처리할 때까지 반복
        while (indexA < moveA.length && indexB < moveB.length) {
            // A, B가 같은 위치에 있고 시간이 0보다 크면 만난 것으로 판단
            if (posA == posB && timeA == timeB && timeA > 0) {
                return timeA; // 만난 시간 리턴
            }

            // A의 이동 처리 (B와 같거나 B보다 뒤쳐짐)
            if (timeA <= timeB) {
                posA += moveA[indexA][0]; // 현재 방향으로 이동
                timeA++; // 총 이동 시간 증가
                moveA[indexA][1]--; // 현재 이동의 남은 시간 감소

                // 현재 이동이 끝났으면 다음 이동으로 
                if (moveA[indexA][1] == 0) {
                    indexA++;
                }
            }

            // B의 이동 처리 (A와 같거나 A보다 뒤쳐짐)
            if (timeB <= timeA) {
                posB += moveB[indexB][0]; // 현재 방향으로 이동
                timeB++; // 총 이동 시간 증가
                moveB[indexB][1]--; // 현재 이동의 남은 시간 감소

                // 현재 이동이 끝났으면 다음 이동으로
                if (moveB[indexB][1] == 0) {
                    indexB++;
                }
            }
        }
        // 모든 이동을 처리했지만 만나지 못한 경우
        return -1;   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        // [N][0]: i번째 이동의 방향, [N][1]: i번째 이동의 시간 
        int[][] moveA = new int[N][2]; 
        int[][] moveB = new int[M][2];

        // A의 이동 입력
        for (int i = 0; i < N; i++) {
            String dir = sc.next();
            int time = sc.nextInt();
            moveA[i][0] = dir.equals("R")? 1 : -1;
            moveA[i][1] = time;
        }

        // B의 이동 입력
        for (int i = 0; i < M; i++) {
            String dir = sc.next();
            int time = sc.nextInt();
            moveB[i][0] = dir.equals("R") ? 1 : -1;
            moveB[i][1] = time;
        }

        int result = findMeetingTime(moveA, moveB);
        System.out.println(result);

        sc.close();
    }
}