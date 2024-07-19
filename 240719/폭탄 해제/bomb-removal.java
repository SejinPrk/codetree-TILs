import java.util.Scanner;

class BombDefuser {
    private String code;
    private String color;
    private int sec;

    public BombDefuser(String code, String color, int sec) {
        this.code = code;
        this.color = color;
        this.sec = sec;
    }

    public void printInfo() {
        System.out.println("code : " + code);
        System.out.println("color : " + color);
        System.out.println("second : " + sec);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String color = sc.next();
        int sec = sc.nextInt();

        BombDefuser defuser = new BombDefuser(code, color, sec);
        defuser.printInfo();

        sc.close();
    }
}