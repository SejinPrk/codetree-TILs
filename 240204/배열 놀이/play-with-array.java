import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int qnum;
        int[] arr = new int[100];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            qnum = sc.nextInt();
            if (qnum == 1){
                int a = sc.nextInt();
                System.out.println(arr[a-1]);
            }
            if (qnum == 2) {
                int a = sc.nextInt();
                boolean isA = false;
                for (int j = 0; j < n; j++) {
                    if(arr[j] == a){
                        System.out.println(j+1);
                        isA = true;
                        break;
                    } 
                } if (isA == false) 
                    System.out.println(0);
            }
            if (qnum == 3) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                for(int j = a-1; j < b; j++){
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}