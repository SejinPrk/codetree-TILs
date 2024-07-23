import java.util.*;

class Point implements Comparable<Point> {
    int num;
    int x;
    int y;
    int distance;

    Point(int num, int x, int y) {
        this.num = num;
        this.x = x;
        this.y = y;
        this.distance = Math.abs(x) + Math.abs(y); // 거리 계산
    }

    @Override
    public int compareTo (Point other) {
        if (this.distance != other.distance) {
            return Integer.compare(this.distance, other.distance);
        }
        return Integer.compare(this.num, other.num);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Point> points = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            points.add(new Point(i, x, y));
        }

        Collections.sort(points);

        for (Point point : points) {
            System.out.println(point.num);
        }

        sc.close();
    }
}