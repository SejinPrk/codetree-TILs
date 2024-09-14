import java.util.Scanner;

public class Main {
    static int minDifference = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] skills = new int[6];

        for (int i = 0; i < 6; i++) {
            skills[i] = sc.nextInt();
        }

        findMinDifference(skills, new boolean[6], 0, 0);

        System.out.println(minDifference);
    }

    static void findMinDifference(int[] skills, boolean[] selected, int cnt, int start) {
        if (cnt == 3) {
            int team1Sum = 0;
            int team2Sum = 0;

            for (int i = 0; i < 6; i++) {
                if (selected[i]) {
                    team1Sum += skills[i];
                } else {
                    team2Sum += skills[i];
                }
            }
            minDifference = Math.min(minDifference, Math.abs(team1Sum - team2Sum));
            return;
        }

        for (int i = start; i < 6; i++) {
            selected[i] = true;
            findMinDifference(skills, selected, cnt + 1, i + 1);
            selected[i] = false;
        }
    }
}