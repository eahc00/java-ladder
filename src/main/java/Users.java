import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Users {

    private final List<User> users = new ArrayList<>();

    public Users(String... usernames) {
        this(Arrays.asList(usernames));
    }

    public Users(List<String> usernames) {
        validateUserNumber(usernames);

        for (int i = 0; i < usernames.size(); i++) {
            this.users.add(new User(usernames.get(i), i));
        }
    }

    private void validateUserNumber(List<String> users) {
        if (users.size() < 2) {
            throw new RuntimeException("사다리타기가 가능한 최소 인원은 2명입니다.");
        }
    }

    public User getUserByUsername(String username) {
        return users.stream()
                .filter(it -> it.getName().equals(username))
                .findAny()
                .orElseThrow(() -> new RuntimeException("찾는 유저가 없습니다"));
    }

    public List<User> getUsers() {
        return this.users;
    }
}