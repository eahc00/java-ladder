import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class TestBooleanGenerator implements BooleanGenerator {

    private Queue<Boolean> booleans = new ArrayDeque<>();

    public TestBooleanGenerator(List<Boolean> booleans) {
        this.booleans = new ArrayDeque<>(booleans);
    }

    @Override
    public boolean generate() {
        return booleans.poll();
    }
}
