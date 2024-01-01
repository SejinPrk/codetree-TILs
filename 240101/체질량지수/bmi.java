import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int weight = sc.nextInt();
        int bmi = weight * 100 * 100/(height * height);


        if(bmi >= 25){
            System.out.println(bmi);
            System.out.println("Obesity");
        
        } else{
            System.out.println(bmi);
        }
    }
}