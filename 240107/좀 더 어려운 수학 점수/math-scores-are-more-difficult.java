import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math_A = sc.nextInt();
        int eng_A = sc.nextInt();
        int math_B = sc.nextInt();
        int eng_B = sc.nextInt();

        if (math_A > math_B) {
            System.out.println("A");
        }
        else if(math_B > math_A){
            System.out.println("B");
        }
        else{
            if(eng_A > eng_B){
                System.out.println("A");
            } else{
            System.out.println("B");
            }  
        }
    }
}