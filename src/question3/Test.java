package question3;

public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[4];

        people[0] = new Person("Alice", "New York");
        people[1] = new Student("Bob", "London", "Computer Science", 2, 15000.0);
        people[2] = new Staff("Charlie", "Paris", "Engineering", 3000.0);
        people[3] = new Professor("Dana", "Tokyo", "Mathematics", 5000.0);

        for (Person p : people) {
            System.out.println(p.displayInfo());  // Polymorphism in action
        }
    }
}
