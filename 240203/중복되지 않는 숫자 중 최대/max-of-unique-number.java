import java.util.Scanner;

public class Main {
        public static final int MAX_N = 1000;
        
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int [MAX_N];
        int n = sc.nextInt();
    
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
          
        int max = -1;
            for (int i = 0; i < n; i++) {
                int curr = arr[i];
                if(max < curr) {
                    int cnt = 0;
                    for (int j  = 0; j < n; j++) {
                        if(arr[j] == curr) {
                            cnt++;
                        }
                    }
                    if (cnt == 1) {
                        max = curr;
                    }
                }
            }   

         System.out.print(max);
    }
}