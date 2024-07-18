import java.util.Scanner;

class User {
    String id;
    int level;

    User(String id, int level) {
        this.id = id;
        this.level = level;
    }

    void printInfo() {
        System.out.println("user " + id + " lv " + level);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 객체 생성 및 초기화
        User user1 = new User("codetree", 10);

        // 두 번째 객체를 위한 입력 받기
        String id = sc.next();
        int level = sc.nextInt();

        // 두 번째 객체 생성
        User user2 = new User(id, level);

        // 정보 출력
        user1.printInfo();
        user2.printInfo();

        sc.close();
    }
}