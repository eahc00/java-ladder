import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Users {

    private static final int USER_NUMBER = 4;
    private List<User> users = new ArrayList<>();

    public Users(String... usernames) {
        this(Arrays.asList(usernames));
    }

    public Users(List<String> usernames) {
        validateUserNumber(usernames);

        for (int i = 0; i < USER_NUMBER; i++) {
            this.users.add(new User(usernames.get(i), i));
        }
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