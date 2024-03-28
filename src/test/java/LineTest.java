import static java.util.List.of;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LineTest {
    /**
     * |-----|     |-----|     |     |  -> LINE
     *
     *
     */
    @Test
    void 사람_수에_맞게_라인을_생성한다() {
        //when
        Line line = new Line(4, new RandomBooleanGenerator());

        // then
        assertThat(line.getPoints().size()).isEqualTo(3);

    }

    @Test
    void 연속되는_두_점은_이어져서는_안된다() {
        // given
        BooleanGenerator testBooleanGenerator = new TestBooleanGenerator(of(true, true, true));

        // when
        Line line = new Line(4, testBooleanGenerator);

        // then
        assertThat(line.getPoints().get(0)).isEqualTo(true);
        assertThat(line.getPoints().get(1)).isEqualTo(false);
        assertThat(line.getPoints().get(2)).isEqualTo(true);
    }
}