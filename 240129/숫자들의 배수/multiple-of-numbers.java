import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int[] arr = new int[10];
        int cnt = 0;

        arr[0] = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            arr[i] = arr[i-1] + arr[0];
        }
    
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
            if(arr[i] % 5 == 0) cnt++;
            if(cnt == 2) break;
        }
    }
}