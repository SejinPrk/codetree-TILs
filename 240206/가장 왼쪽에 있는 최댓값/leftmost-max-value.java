import java.util.*;

public class Main {
    public static final int MAX_N = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[MAX_N];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int idx = n;

        while(true){
            int maxIdx = 0;
            
            for (int i = 1; i < idx; i++) {
                if(arr[i] > arr[maxIdx]){
                    maxIdx = i;
                }
            }

            System.out.print((maxIdx + 1) + " ");
            if(maxIdx == 0) {
                break;
            }
            idx = maxIdx;

        }
    }
}