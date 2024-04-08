import java.util.ArrayList;
import java.util.List;

public class Line {

    private final List<Boolean> points = new ArrayList<>();

    public Line(int personCount, BooleanGenerator generator) {
        for (int i = 0; i < personCount - 1; i++) {
            points.add(generateValidPoint(generator));
        }
    }

    private boolean generateValidPoint(BooleanGenerator generator) {
        if (!points.isEmpty() && points.get(points.size() - 1)) {
            return false;
        }
        return generator.generate();
    }

    public void move(User user) {
        int currentLocation = user.getState();
        if (canMoveLeft(currentLocation)) {
            user.moveLeft();
            return;
        }
        if (canMoveRight(currentLocation)) {
            user.moveRight();
        }
    }

    private boolean canMoveLeft(int currentLocation) {
        return currentLocation - 1 >= 0 && points.get(currentLocation - 1);
    }

    private boolean canMoveRight(int currentLocation) {
        return currentLocation < points.size() && points.get(currentLocation);
    }

    public List<Boolean> getPoints() {
        return points;
    }
}
