import java.util.Scanner;

public class Main {
        public static final int MAX_N = 1000;
        
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] arr = new int [1000];
    
        for (int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
          
            for (int i = 0; i < 10; i++) {
                int curr = arr[i];
                if(curr < 500) {
                    if (arr[i]>= max){
                        max = arr[i];
                    }
                } 
            }
            for (int i = 0; i < 10; i++) {
                int curr2 = arr[i];
                 if (curr2 > 500)
                    if(arr[i] <= min){
                        min = arr[i];
                    }
                }
                System.out.println(max + " " + min);
            }   
    }