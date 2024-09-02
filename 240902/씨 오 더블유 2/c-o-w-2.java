import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.next();

        // 'C', 'O', 'W'의 각 위치를 저장할 리스트
        List<Integer> cPositions = new ArrayList<>();
        List<Integer> oPositions = new ArrayList<>();
        List<Integer> wPositions = new ArrayList<>();
        
        // 각 문자의 위치를 기록
        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);
            if (ch == 'C') {
                cPositions.add(i);
            } else if (ch == 'O') {
                oPositions.add(i);
            } else if (ch == 'W') {
                wPositions.add(i);
            }
        }

        // 'COW' 조합 찾기
        int cnt = 0;
        for (int c : cPositions) {
            for (int o : oPositions) {
                if (o > c) { // O가 C보다 뒤에 있어야 함
                    for (int w : wPositions) {
                        if (w > o) { // W가 O보다 뒤에 있어야 함
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}