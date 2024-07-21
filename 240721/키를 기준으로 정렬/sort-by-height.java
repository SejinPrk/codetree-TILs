import java.util.*;
class Person implements Comparable<Person> {
    String name;
    int height;
    int weight;

    Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override 
    public int compareTo(Person other) {
        return this.height - other.height;
    }

    @Override
    public String toString() {
        return name + " " + height + " " + weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            int height = Integer.parseInt(input[1]);
            int weight = Integer.parseInt(input[2]);
            people.add(new Person(name, height, weight));
        }

        Collections.sort(people);

        for(Person person : people) {
            System.out.println(person);
        }

        sc.close();
    }
}