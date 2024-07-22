import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("%s %d %.1f", name, height, weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            people.add(new Person(name, height, weight));
        }

        // 이름순 정렬 및 출력
        Collections.sort(people);
        System.out.println("name");

        for (Person p : people) {
            System.out.println(p);
        }

        // 키 순 정렬 및 출력
        System.out.println("\nheight");
        people.sort((p1, p2) -> p2.height - p1.height);

        for (Person p : people) {
            System.out.println(p);
        }

        sc.close();
    }
}