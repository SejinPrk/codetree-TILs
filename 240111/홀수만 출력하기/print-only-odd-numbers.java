import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
             if((i % 2 == 1) && (i%3 ==0)){
                    System.out.println(i);
                }
            }
                
        }
    }