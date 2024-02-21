import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[20];
        int cnt = 0;

        for(int i = 0; i < 10; i++) {
            str[i] = sc.next();
        }
        
        char a = sc.next().charAt(0);

        for(int i = 0; i < 10 ; i++) {
            if(str[i].charAt(str[i].length()-1) == a){
                ++ cnt;
                System.out.println(str[i]);  
            }
        }
        if (cnt == 0){
            System.out.println("None");
        }
    }
}