import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add(new User(1, "Ivan", "Ivanov", 23, "Russia"));
        userList.add(new User(2, "Andre", "Lilou", 5, "France"));
        userList.add(new User(3, "Maxim", "Volkov", 13, "Russia"));
        userList.add(new User(4, "Giulio", "Cavani", 32, "Italy"));
        userList.add(new User(5, "Xi", "Li-Chan", 15, "China"));

        System.out.println("\nTask 1:");
        sortByLastName(userList);

        System.out.println("\nTask 2:");
        sortByAge(userList);

        System.out.println("\nTask 3:");
        checkAge(userList);

        System.out.println("\nTask 4:");
        averageAge(userList);

        System.out.println("\nTask 5:");
        variousCountries(userList);
    }

    public static void sortByLastName(List<User> list) {
        System.out.println("All users sorted by last name:");

        list.stream()
            .sorted()
            .forEach(System.out::println);
    }

    public static void sortByAge(List<User> list) {
        System.out.println("All users sorted by age:");
        list.stream()
            .sorted(new AgeComparator())
            .forEach(System.out::println);
    }

    public static void checkAge(List<User> list) {
        System.out.println("All users with age > 7:");

        list.stream()
            .filter(x -> x.getAge() > 7)
            .forEach(System.out::println);
    }

    public static void averageAge(List<User> list) {
        OptionalDouble avg = list.stream()
            .mapToInt(x -> x.getAge())
            .average();
        
        System.out.println("Average user age is " + avg.orElse(-1));
    }

    public static void variousCountries(List<User> list) {
        long num = list.stream()
            .distinct()
            .count();

        System.out.println("There are " + num + " various countries in this list");
    }
}
