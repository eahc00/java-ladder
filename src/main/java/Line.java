import java.util.ArrayList;
import java.util.List;

public class Line {

    private List<Boolean> points = new ArrayList<>();

    public Line(int personCount, BooleanGenerator generator) {
        for (int i = 0; i < personCount - 1; i++) {
            points.add(generateValidPoint(generator));
        }
    }

    private boolean generateValidPoint(BooleanGenerator generator) {
        if (!points.isEmpty() && points.get(points.size()-1)) {
            return false;
        }
        return generator.generate();
    }

    public void move(User user) {
        int currentLocation = user.getState();
        if (currentLocation - 1 >= 0 && points.get(currentLocation-1)) {
            user.moveLeft();
            return ;
        }
        if (currentLocation < points.size() && points.get(currentLocation)) {
            user.moveRight();
        }
    }

    public List<Boolean> getPoints() {
        return points;
    }
}
