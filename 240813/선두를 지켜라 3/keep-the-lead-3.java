import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        long[] distanceA = new long[1000001];
        long[] distanceB = new long[1000001];
        
        int totalTime = 0;
        for (int i = 0; i < N; i++) {
            int v = scanner.nextInt();
            int t = scanner.nextInt();
            for (int j = totalTime + 1; j <= totalTime + t; j++) {
                distanceA[j] = distanceA[j-1] + v;
            }
            totalTime += t;
        }
        
        totalTime = 0;
        for (int i = 0; i < M; i++) {
            int v = scanner.nextInt();
            int t = scanner.nextInt();
            for (int j = totalTime + 1; j <= totalTime + t; j++) {
                distanceB[j] = distanceB[j-1] + v;
            }
            totalTime += t;
        }
        
        int changes = 0;
        int currentLead = 0; // 0: tie, 1: A leads, 2: B leads
        
        for (int i = 1; i <= totalTime; i++) {
            int newLead;
            if (distanceA[i] > distanceB[i]) {
                newLead = 1;
            } else if (distanceA[i] < distanceB[i]) {
                newLead = 2;
            } else {
                newLead = 0;
            }
            
            if (newLead != currentLead) {
                changes++;
                currentLead = newLead;
            }
        }
        
        System.out.println(changes);
        
        scanner.close();
    }
}