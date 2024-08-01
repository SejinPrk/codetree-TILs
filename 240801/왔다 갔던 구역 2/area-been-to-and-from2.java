import java.util.Scanner;

public class Main {    
    public static final int OFFSET = 1000;  // 음수를 피하기 위한 OFFSET
    public static final int MAX_R = 2000;   // 최대 배열 크기 (OFFSET*2)
    public static final int MAX_N = 100;    // 최대 명령 수
    
    public static int n;  // 명령 수
    public static int[] x1 = new int[MAX_N]; // 각 명령의 시작점
    public static int[] x2 = new int[MAX_N]; // 각 명령의 끝점
    
    public static int[] checked = new int[MAX_R + 1]; // 방문 횟수 기록 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 명령 수 입력
        n = sc.nextInt();
        
        // 현재 위치 초기화
        int cur = 0;
        
        for(int i = 0; i < n; i++) {
            int distance = sc.nextInt();  // 이동 거리
            char direction = sc.next().charAt(0); // 이동 방향 (L 또는 R)
            
            if(direction == 'L') {
                // 왼쪽으로 이동할 경우: cur - distance ~ cur까지 경로 이동
                x1[i] = cur - distance;
                x2[i] = cur;
                cur -= distance;
            } else {
                // 오른쪽으로 이동할 경우: cur ~ cur + distance까지 경로 이동
                x1[i] = cur;
                x2[i] = cur + distance;
                cur += distance;
            }
            
            // OFFSET을 더하여 배열 인덱스 음수 방지
            x1[i] += OFFSET;
            x2[i] += OFFSET;
        }
        
        // 각 구간을 칠하기 (x2[i]에는 등호가 들어가지 않음)
        for(int i = 0; i < n; i++)
            for(int j = x1[i]; j < x2[i]; j++)
                checked[j]++;
        
        // 2번 이상 지나간 영역의 크기 계산
        int cnt = 0;
        for(int i = 0; i <= MAX_R; i++)
            if(checked[i] >= 2)
                cnt++;
        
        // 결과 출력
        System.out.print(cnt);
    }
}