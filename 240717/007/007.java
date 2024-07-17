import java.util.Scanner;

class SecretMeeting {
    private String secretCode;
    private char meetingPoint;
    private int time;

    public SecretMeeting(String secretCode, char meetingPoint, int time) {
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }

    public void printMeetingInfo() {
        System.out.println("secret code : " + secretCode);
        System.out.println("meeting point : " + meetingPoint);
        System.out.println("time : " + time);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 전체 입력 라인을 읽고 공백으로 분리
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        // 각 부분을 변수에 할당
        String secretCode = parts[0];
        char meetingPoint = parts[1].charAt(0);
        int time = Integer.parseInt(parts[2]);

        // SecretMeeting 객체 생성
        SecretMeeting meeting = new SecretMeeting(secretCode, meetingPoint, time);
        
        // 정보 출력
        meeting.printMeetingInfo();

        scanner.close();
    }
}