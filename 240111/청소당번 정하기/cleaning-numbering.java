import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int cnt_class = 0;
        int cnt_hall = 0;
        int cnt_toilet = 0;

        for (int i = 1; i <= day; i++) {
            if(i % 12 == 0)
                cnt_toilet++;
            else if(i % 3 == 0)
                cnt_hall++;
            else if(i % 2 == 0)
                cnt_class++;
            }
        System.out.println(cnt_class + " " + cnt_hall + " "+ cnt_toilet);
    }
}