import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] times = new int[N][2];
        
        // 입력 받기
        for (int i = 0; i < N; i++) {
            times[i][0] = sc.nextInt(); // 시작 시간
            times[i][1] = sc.nextInt(); // 종료 시간
        }
        
        int maxOperatingTime = 0;
        
        // 각 개발자를 한 명씩 제외해보면서 최대 운행 시간 계산
        for (int exclude = 0; exclude < N; exclude++) {
            List<int[]> remainingTimes = new ArrayList<>();
            
            // 제외할 개발자를 뺀 나머지 시간들을 리스트에 추가
            for (int i = 0; i < N; i++) {
                if (i != exclude) {
                    remainingTimes.add(times[i]);
                }
            }
            
            // 현재 조합에서의 운행 시간 계산
            int currentOperatingTime = calculateOperatingTime(remainingTimes);
            maxOperatingTime = Math.max(maxOperatingTime, currentOperatingTime);
        }
        
        System.out.println(maxOperatingTime);
    }
    
    private static int calculateOperatingTime(List<int[]> times) {
        // 모든 가능한 시간대에 대해 검사
        int operatingTime = 0;
        for (int time = 1; time <= 1000; time++) {
            // 현재 시간에 일하는 개발자가 있는지 확인
            boolean isWorking = false;
            for (int[] schedule : times) {
                if (time >= schedule[0] && time < schedule[1]) {
                    isWorking = true;
                    break;
                }
            }
            if (isWorking) {
                operatingTime++;
            }
        }
        return operatingTime;
    }
}