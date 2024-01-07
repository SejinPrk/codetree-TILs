import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age_A = sc.nextInt();
        String gender_A = sc.next();
        int age_B = sc.nextInt();
        String gender_B = sc.next();

        if ((age_A >= 19 || age_B >= 19) && (gender_A.equals("M") || gender_B.equals("M"))) {
            System.out.println("1");
        }
        else{
            System.out.println("0");  
        }
    }
}