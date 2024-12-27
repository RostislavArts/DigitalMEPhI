import lombok.*;

@AllArgsConstructor
@Getter
@ToString
public class User implements Comparable<User> {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String country;

    @Override
    public int compareTo(User user) {
        return lastName.compareTo(user.lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        return country == ((User) obj).country;
    }

    @Override
    public int hashCode() {
        return country.length();
    }
}
