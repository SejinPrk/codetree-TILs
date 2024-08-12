import java.util.*;

class Shake implements Comparable<Shake> {
    int time;
    int dev1;
    int dev2;
    
    public Shake(int time, int dev1, int dev2) {
        this.time = time;
        this.dev1 = dev1;
        this.dev2 = dev2;
    }

    @Override
    public int compareTo(Shake shake) {
        // 시간: 오름차순 정렬
        return time - shake.time;
    }
};

public class Main {
    public static final int MAX_T = 250;
    public static final int MAX_N = 100;
    
    public static int n, k, p, t;
    public static int[] shakeNum = new int[MAX_N + 1];
    public static boolean[] infected = new boolean[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        p = sc.nextInt();
        t = sc.nextInt();
        infected[p] = true;
        
        Shake[] shakes = new Shake[MAX_T];
        
        for(int i = 0; i < t; i++) {
            int time = sc.nextInt();
            int dev1 = sc.nextInt();
            int dev2 = sc.nextInt();

            shakes[i] = new Shake(time, dev1, dev2);
        }
        
        // custom comparator를 활용한 정렬
        Arrays.sort(shakes, 0, t);
        
        // K번 초과: 전염 x
        for(int i = 0; i < t; i++) {
            int target1 = shakes[i].dev1;
            int target2 = shakes[i].dev2;
            
            // 감염되어 있을 경우: 악수 횟수 증가
            if(infected[target1])
                shakeNum[target1]++;
            if(infected[target2])
                shakeNum[target2]++;
            
            // target1 -> target2 전염
            if(shakeNum[target1] <= k && infected[target1])
                infected[target2] = true;
            
            // target2 -> target1을 전염
            if(shakeNum[target2] <= k && infected[target2])
                infected[target1] = true;
        }
        
        for(int i = 1; i <= n; i++) {
            if(infected[i])
                System.out.print(1);
            else
                System.out.print(0);
        }
        
    }
}