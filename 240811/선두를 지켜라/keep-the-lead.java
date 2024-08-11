import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 로봇 A와 B의 움직임 횟수 입력
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // 로봇 A와 B의 움직임 정보 저장
        List<int[]> movesA = new ArrayList<>();
        List<int[]> movesB = new ArrayList<>();
        
        // 로봇 A의 움직임 입력
        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            String d = scanner.next();
            movesA.add(new int[]{t, d.equals("L") ? -1 : 1});
        }
        
        // 로봇 B의 움직임 입력
        for (int i = 0; i < m; i++) {
            int t = scanner.nextInt();
            String d = scanner.next();
            movesB.add(new int[]{t, d.equals("L") ? -1 : 1});
        }
        
        int meetCount = countMeetings(movesA, movesB);
        System.out.println(meetCount);
    }
    
    private static int countMeetings(List<int[]> movesA, List<int[]> movesB) {
        int posA = 0, posB = 0;
        int timeA = 0, timeB = 0;
        int indexA = 0, indexB = 0;
        int meetCount = 0;
        boolean lastPositionSame = true;
        
        while (indexA < movesA.size() || indexB < movesB.size()) {
            // 로봇 A 이동
            if (indexA < movesA.size() && timeA == 0) {
                int[] move = movesA.get(indexA);
                timeA = move[0];
                posA += move[1];
                indexA++;
            }
            
            // 로봇 B 이동
            if (indexB < movesB.size() && timeB == 0) {
                int[] move = movesB.get(indexB);
                timeB = move[0];
                posB += move[1];
                indexB++;
            }
            
            // 만남 확인
            if (posA == posB && !lastPositionSame) {
                meetCount++;
            }
            
            lastPositionSame = (posA == posB);
            
            // 시간 감소
            if (timeA > 0) timeA--;
            if (timeB > 0) timeB--;
        }
        
        return meetCount;
    }
}