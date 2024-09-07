import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<int[]> people = new ArrayList<>(); // 사람들의 위치와 팻말 저장

        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            char type = sc.next().charAt(0); // 팻말 G 또는 H
            int score = (type == 'G') ? 1 : 2;  // G면 1점, H면 2점
            people.add(new int[]{position, score});
        }

        // 위치 기준으로 정렬
        Collections.sort(people, (a, b) -> a[0] - b[0]);

        int maxScore = 0; // 최대 점수 
        int currScore = 0; // 현재 구간의 점수
        int left = 0; // 슬라이딩 윈도우의 왼쪽 끝

        // 슬라이딩 윈도우 탐색
        for (int right = 0; right < n; right++) {
            // 오른쪽 끝 사람 추가
            currScore += people.get(right)[1];

            // 구간의 크기가 K를 넘으면 왼쪽 끝을 제거
            while (people.get(right)[0] - people.get(left)[0] > k) {
                currScore -= people.get(left)[1];
                left++;
            }
            
            // 최대 점수 갱신
            maxScore = Math.max(maxScore, currScore);
        }
        System.out.println(maxScore);
    }
}