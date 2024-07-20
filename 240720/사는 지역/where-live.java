import java.util.*;

// 각 사람의 이름, 주소, 도시 정보를 저장
class Person implements Comparable<Person> {
    // Comparable 인터페이스를 구현하여 이름을 기준으로 비교
    String name;
    String addr;
    String city;

    public Person(String name, String addr, String city) {
        this.name = name;
        this.addr = addr;
        this.city = city;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행문자 제거

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] info = sc.nextLine().split(" ");
            people.add(new Person(info[0], info[1], info[2]));
        }
        // 이름이 사전순으로 가장 마지막인 사람을 찾기
        Person lastPerson = Collections.max(people);

        System.out.println("name " + lastPerson.name);
        System.out.println("addr " + lastPerson.addr);
        System.out.println("city " + lastPerson.city);

        sc.close();
    }
}