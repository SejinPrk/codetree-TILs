import java.util.*;

public class Main {
    static int minDifference = Integer.MAX_VALUE;
    static boolean possible = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] skills = new int[5];
        
        for (int i = 0; i < 5; i++) {
            skills[i] = sc.nextInt();
        }
        
        int[] teams = new int[5];
        findMinDiff(skills, teams, 0);
        
        System.out.println(possible ? minDifference : -1);
    }
    
    public static void findMinDiff(int[] skills, int[] teams, int index) {
        if (index == 5) {
            int[] teamSum = new int[3];
            for (int i = 0; i < 5; i++) {
                teamSum[teams[i]] += skills[i];
            }
            
            // 세 팀의 능력치가 모두 다른 경우에만 고려
            if (teamSum[0] != teamSum[1] && teamSum[1] != teamSum[2] && teamSum[0] != teamSum[2]) {
                int maxTeam = Math.max(teamSum[0], Math.max(teamSum[1], teamSum[2]));
                int minTeam = Math.min(teamSum[0], Math.min(teamSum[1], teamSum[2]));
                minDifference = Math.min(minDifference, maxTeam - minTeam);
                possible = true;
            }
            return;
        }
        
        for (int i = 0; i < 3; i++) {
            teams[index] = i;
            findMinDiff(skills, teams, index + 1);
        }
    }
}