import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] skills = new int[5];

        for (int i = 0; i < 5; i++) {
            skills[i] = sc.nextInt();
        }

        int result = findMinDiff(skills);
        System.out.println(result);
    }

    public static int findMinDiff(int[] skills) {
        List<Integer> teamSums = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                int team1 = skills[i] + skills[j];

                List<Integer> remaining = new ArrayList<>();
                for (int k = 0; k < 5; k++) {
                    if (k != i && k != j) {
                        remaining.add(skills[k]);
                    }
                }
                int team2 = remaining.get(0) + remaining.get(1);
                int team3 = remaining.get(2);

                if (team1 != team2 && team2 != team3 && team1 != team3) {
                    int[] teams = {team1, team2, team3};
                    Arrays.sort(teams); // 최소, 중간, 최댓값 정렬
                    int maxDiff = teams[2] - teams[0];
                    teamSums.add(maxDiff);
                }
            }
        }
        if (teamSums.isEmpty()) {
            return -1;
        }

        return Collections.min(teamSums);
    }
}