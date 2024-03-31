import static org.assertj.core.api.Assertions.assertThat;
import static java.util.List.of;

import org.junit.jupiter.api.Test;

class LadderTest {

    @Test
    void 최대_높이_수만큼의_줄을_가져야_한다() {
        //given
        RandomBooleanGenerator generator = new RandomBooleanGenerator();
        // when
        Ladder ladder = new Ladder(4, 5, generator);
        // then
        assertThat(ladder.getLines().size()).isEqualTo(5);
    }

    @Test
    void 입력_받은_유저의_개인별_결과를_반환한다() {
        // given
        Ladder ladder = new Ladder(4, 5, new TestBooleanGenerator(of(true, true, false, true, true, false, false, true, true, true)));
        User user = new User("bb", 1);
        // when
        ladder.generatorUserResult(user);
        // then
        assertThat(user.getState()).isEqualTo(3);
    }
}