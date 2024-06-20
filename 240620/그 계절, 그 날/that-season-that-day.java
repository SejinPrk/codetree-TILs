import java.util.Scanner;

public class Main {

    // 윤년을 판별하는 함수
    public static boolean isLeapYear(int y) {
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    // 입력받은 연도, 월, 일에 따라 계절을 판별하는 함수
    public static int detectSeason(int y, int m, int d) {
        if (m < 1 || m > 12) {
            return -1; // 잘못된 월 입력
        }

        // 월별로 계절을 판별
        if (m >= 3 && m <= 5) {
            return 1; // 봄
        } else if (m >= 6 && m <= 8) {
            return 2; // 여름
        } else if (m >= 9 && m <= 11) {
            return 3; // 가을
        } else {
            return 4; // 겨울
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 연도, 월, 일 입력
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        // 유효한 날짜인지 체크 (=> 윤년 여부에 따른 2월의 일 수 체크)
        boolean validDate = true;
        if (m == 2) {
            if (isLeapYear(y)) {
                if (d < 1 || d > 29) {
                    validDate = false;
                }
            } else {
                if (d < 1 || d > 28) {
                    validDate = false;
                }
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d < 1 || d > 30) {
                validDate = false;
            }
        } else {
            if (d < 1 || d > 31) {
                validDate = false;
            }
        }

        if (!validDate) {
            System.out.println("-1"); // 잘못된 날짜 입력
        } else {
            int seasonCode = detectSeason(y, m, d);
            switch (seasonCode) {
                case 1:
                    System.out.println("Spring");
                    break;
                case 2:
                    System.out.println("Summer");
                    break;
                case 3:
                    System.out.println("Fall");
                    break;
                case 4:
                    System.out.println("Winter");
                    break;
                default:
                    System.out.println("-1"); // 이 부분은 실제로는 실행되지 않음
                    break;
            }
        }
    }
}