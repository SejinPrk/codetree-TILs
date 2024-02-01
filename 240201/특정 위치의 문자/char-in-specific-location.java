import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] word = new char[]{ 'L', 'E', 'B', 'R', 'O', 'S' };
        char a = sc.next().charAt(0);

        // 해당 문자를 찾지 못했다면 -1
        int idx = -1;

        for (int i = 0; i < 6; i++) {
            if (word[i] == a) {
                idx = i;
            }
        }
        if (idx==-1){
            System.out.println("None");
        }else{
            System.out.println(idx);
        }
    }
}