import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 25, "New York"));
        people.add(new Person("Alice", 22, "Los Angeles"));
        people.add(new Person("Bob", 30, "New York"));
        people.add(new Person("Charlie", 20, "Chicago"));

        // Sort by age
        people.sort(Comparator.comparingInt(Person::getAge));

        // Filter by city
        people.removeIf(person -> !person.getCity().equals("New York"));

        // Print the sorted and filtered list
        people.forEach(System.out::println);
    }
}