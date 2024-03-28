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

    public List<Boolean> getPoints() {
        return points;
    }
}
