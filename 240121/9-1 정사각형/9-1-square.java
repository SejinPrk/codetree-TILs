import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 9;

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print(cnt);
                if(cnt == 1){
                    cnt = 9;
                } else {
                cnt--;
               } 
             }
            System.out.println();

            }
            System.out.println();
        }
    }