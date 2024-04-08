import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private final List<Line> lines = new ArrayList<>();


    public Ladder(Users users, int height, BooleanGenerator generator) {
        initLadder(users, height, generator);
    }

    private void initLadder(Users users, int height, BooleanGenerator generator) {
        for (int i = 0; i < height; i++) {
            lines.add(new Line(users.getUsers().size(), generator));
        }
    }

    public void playLadderGameForAllUsers(Users users) {
        for (User user : users.getUsers()) {
            playLadderGameForUser(user);
        }
    }

    private void playLadderGameForUser(User user) {
        for (Line line : lines) {
            line.move(user);
        }
    }

    public List<Line> getLines() {
        return lines;
    }
}