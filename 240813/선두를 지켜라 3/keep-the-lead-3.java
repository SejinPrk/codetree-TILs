import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        long[] distanceA = new long[1000001];
        long[] distanceB = new long[1000001];
        
        int totalTime = 0;
        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = totalTime + 1; j <= totalTime + t; j++) {
                distanceA[j] = distanceA[j-1] + v;
            }
            totalTime += t;
        }
        
        totalTime = 0;
        for (int i = 0; i < M; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = totalTime + 1; j <= totalTime + t; j++) {
                distanceB[j] = distanceB[j-1] + v;
            }
            totalTime += t;
        }
        
        int changes = 0;
        int currentLead = 0; // 0: 동점, 1: A가 선두, 2: B가 선두
        
        for (int i = 1; i <= totalTime; i++) {
            int newLead;
            if (distanceA[i] > distanceB[i]) {
                newLead = 1;
            } else if (distanceA[i] < distanceB[i]) {
                newLead = 2;
            } else {
                newLead = 0; // 동점일 경우
            }
            
            if (newLead != currentLead) {
                changes++;
                currentLead = newLead;
            }
        }
        
        System.out.println(changes);
        
        sc.close();
    }
}