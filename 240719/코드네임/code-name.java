import java.util.Scanner;

class Agent {
    private String codename;
    private int score;

    public Agent(String codename, int score) {
        this.codename = codename;
        this.score = score;
    }

    public String getCodename() {
        return codename;
    }

    public int getScore() {
        return score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agent[] agents = new Agent[5];

        // 5명의 요원 정보 입력받기
        for (int i = 0; i < 5; i++) {
            String codename = scanner.next();
            int score = scanner.nextInt();
            agents[i] = new Agent(codename, score);
        }

        // 점수가 가장 낮은 요원 찾기
        Agent lowestScoreAgent = agents[0];
        for (int i = 1; i < 5; i++) {
            if (agents[i].getScore() < lowestScoreAgent.getScore()) {
                lowestScoreAgent = agents[i];
            }
        }

        // 결과 출력
        System.out.println(lowestScoreAgent.getCodename() + " " + lowestScoreAgent.getScore());

        scanner.close();
    }
}