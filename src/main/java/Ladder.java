import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private final List<Line> lines = new ArrayList<>();


    public Ladder(int personCount, int height, BooleanGenerator generator) {
        initLadder(personCount, height, generator);
    }

    private void initLadder(int personCount, int height, BooleanGenerator generator) {
        for (int i = 0; i < height; i++) {
            lines.add(new Line(personCount, generator));
        }
    }

    public void generateAllResult(Users users) {
        for (User user : users.getUsers()) {
            generateUserResult(user);
        }
    }

    private void generateUserResult(User user) {
        for (Line line : lines) {
            line.move(user);
        }
    }

    public List<Line> getLines() {
        return lines;
    }
}