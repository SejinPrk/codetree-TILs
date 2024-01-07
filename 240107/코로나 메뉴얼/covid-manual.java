import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sym = sc.next();
        String a = "a";
        int temp = sc.nextInt();
        int count = 0;

        for (int i = 0; i < 3; i++){
         if (sym.equals("Y")) {
            if(temp >= 37){
                a = "A";
                count += 1;
            } else { 
                a = "C";
            }
        } else {
            if(temp >= 37){
                a = "B";
            } else{
                a = "D"; 
            }   
        }
        }
        if(count >= 2){
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}