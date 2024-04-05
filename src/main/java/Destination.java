import java.util.ArrayList;
import java.util.List;

public class Destination {

    private List<String> destination;

    public Destination(Users users, List<String> destination) {
        validDestination(users, destination);
        this.destination = destination;
    }

    private static void validDestination(Users users, List<String> destination) {
        if (destination.size() != users.getUsers().size()) {
            throw new RuntimeException("실행 결과의 수와 유저의 수가 같아야 합니다.");
        }
    }

    public String getUserDestination(User user) {
        return this.destination.get(user.getState());
    }

    public List<String> getDestination() {
        return destination;
    }
}