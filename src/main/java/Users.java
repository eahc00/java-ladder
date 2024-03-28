import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Users {

    private static final int USER_NUMBER = 4;
    private final List<User> users;

    public Users(String... usernames) {
        this(Arrays.asList(usernames));
    }

    public Users(List<String> usernames) {
        validateUserNumber(usernames);
        this.users = usernames.stream()
                .map(User::new)
                .collect(Collectors.toList());
    }

    private void validateUserNumber(List<String> users) {
        if (users.size() != USER_NUMBER) {
            throw new RuntimeException();
        }
    }

    public List<User> getUsers() {
        return this.users;
    }
}