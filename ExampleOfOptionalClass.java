import java.util.Optional;

class User {
    private String name;
    private Optional<String> email;

    public User(String name, Optional<String> email) {
        this.name = name;
        this.email = email;
    }

    public Optional<String> getEmail() {
        return email;
    }
}

public class ExampleOfOptionalClass {

    public static void printEmail(User user) {
        user.getEmail()
                .ifPresentOrElse(
                        email -> System.out.println("Email: " + email),
                        () -> System.out.println("No Email Provided")
                );
    }


    public static void main(String[] args) {
        User userWithEmail = new User("Zohaib", Optional.of("zohaib@gmail.com"));
        User userWithoutEmail = new User("Yusuf", Optional.empty());

        printEmail(userWithEmail);
        printEmail(userWithoutEmail);
    }
}
