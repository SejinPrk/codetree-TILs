import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


//  각 날의 날짜, 요일, 날씨 정보를 저장
class WeatherInfo implements Comparable<WeatherInfo> {
    // Comparable 인터페이스를 구현하여 날짜를 기준으로 비교
    LocalDate date; // LocalDate를 사용하여 날짜를 파싱하고 저장
    String day;
    String weather;

    public WeatherInfo(String dateStr, String day, String weather) {
        this.date = LocalDate.parse(dateStr);
        this.day = day;
        this.weather = weather;
    }

    @Override
    public int compareTo(WeatherInfo other) {
        return this.date.compareTo(other.date);
    }

    @Override
    public String toString() {
        return this.date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + " " + day + " " + weather;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행문자 제거

        List<WeatherInfo> weatheInfoList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] info = sc.nextLine().split(" ");
            weatheInfoList.add(new WeatherInfo(info[0], info[1], info[2]));
        }
        
        Collections.sort(weatheInfoList);
        
        WeatherInfo nearestRain = null;
        for (WeatherInfo info : weatheInfoList) {
            if ("Rain".equals(info.weather)) {
                nearestRain = info;
                break;
            }
        }

        if (nearestRain != null) {
            System.out.println(nearestRain);
        }

        sc.close();
    }
}