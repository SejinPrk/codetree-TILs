import java.util.*;

public class Main {
    static int minDifference = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] skills = new int[5];
        
        for (int i = 0; i < 5; i++) {
            skills[i] = sc.nextInt();
        }
        
        int[] teams = new int[5];
        findMinDiff(skills, teams, 0);
        
        System.out.println(minDifference == Integer.MAX_VALUE ? -1 : minDifference);
    }
    
    public static void findMinDiff(int[] skills, int[] teams, int index) {
        if (index == 5) {
            int[] teamSum = new int[3];
            for (int i = 0; i < 5; i++) {
                teamSum[teams[i]] += skills[i];
            }
            
            if (teamSum[0] != teamSum[1] && teamSum[1] != teamSum[2] && teamSum[0] != teamSum[2]) {
                int maxTeam = Math.max(teamSum[0], Math.max(teamSum[1], teamSum[2]));
                int minTeam = Math.min(teamSum[0], Math.min(teamSum[1], teamSum[2]));
                minDifference = Math.min(minDifference, maxTeam - minTeam);
            }
            return;
        }
        
        for (int i = 0; i < 3; i++) {
            teams[index] = i;
            findMinDiff(skills, teams, index + 1);
        }
    }
}