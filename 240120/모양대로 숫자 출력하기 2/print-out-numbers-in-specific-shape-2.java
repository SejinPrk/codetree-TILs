import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cnt++;
               if(cnt % 2 == 0){
                System.out.print(cnt + " ");
                if(cnt == 8){
                    cnt = 1;
                } else {
                cnt++;
               } 
             }
            }
            System.out.println();
        }
    }
}