import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private final List<Line> lines = new ArrayList<>();
    private final Users users;

    public Ladder(Users users, int height, BooleanGenerator generator) {
        this.users = users;
        //TODO
        initLadder(height, generator);
    }

    private void initLadder(int height, BooleanGenerator generator) {
        for (int i = 0; i < height; i++) {
            lines.add(new Line(users.getUsers().size(), generator));
        }
    }

    public List<Line> getLines() {
        return lines;
    }

    public Users getUsers() {
        return users;
    }
}
