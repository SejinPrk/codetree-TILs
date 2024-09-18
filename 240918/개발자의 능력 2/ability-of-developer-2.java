import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] skills = new int[6];
        for (int i = 0; i < 6; i++) {
            skills[i] = sc.nextInt();
        }

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                int team1 = skills[i] + skills[j];

                // 나머지 4명 중 2명 선택
                for (int k = 0; k < 6; k++) {
                    if (k == i || k == j) continue;
                    for (int l = k + 1; l < 6; l++) {
                        if (l == i || l ==j) continue;
                        int team2 = skills[k] + skills[l];

                        int[] remaining = new int[2];
                        int index = 0;
                        for (int m = 0; m < 6; m++) {
                            if (m != i && m != j && m != k && m != l) {
                                remaining[index++] = skills[m];
                            }
                        }
                        int team3 = remaining[0] + remaining[1];
                        
                        // 세 팀의 합을 구해 최댓값과 최솟값의 차 계산
                        int[] sums = {team1, team2, team3};
                        Arrays.sort(sums);
                        int diff = sums[2] - sums[0];

                        minDiff = Math.min(minDiff, diff);
                    }
                }
            }
        }
        System.out.println(minDiff);
        sc.close();
    }
}