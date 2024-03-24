import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Users {

    private static final int USER_NUMBER = 4;
    public List<User> users;

    public Users(String... usernames) {
        validateUsername(Arrays.asList(usernames));
        this.users = Arrays.asList(usernames)
                .stream()
                .map(User::new)
                .collect(Collectors.toList());
    }

    public Users(List<String> usernames) {
        validateUsername(usernames);
        this.users = usernames.stream()
                .map(User::new)
                .collect(Collectors.toList());
    }

    private static void validateUsername(List<String> users) {
        if (users.size() != USER_NUMBER) {
            throw new RuntimeException();
        }
    }


}
