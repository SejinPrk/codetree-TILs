import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[]{ "apple", "banana", "grape", "blueberry", "orange" };
        int cnt = 0;
        char a = sc.next().charAt(0);

       for (int i = 0; i < 5; i++){
        for (int j = 2; j < 4; j++){
            if (arr[i].charAt(j) == a){
                cnt++;
                System.out.println(arr[i]);
            }
        }
       }
        System.out.println(cnt);
    }
}