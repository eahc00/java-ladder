import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LadderTest {

    @Test
    void 최대_높이_수만큼의_줄을_가져야_한다() {
        //given
        Users users = new Users("aa", "bb", "cc", "dd");
        RandomBooleanGenerator generator = new RandomBooleanGenerator();
        // when
        Ladder ladder = new Ladder(users, 5, generator);
        // then
        assertThat(ladder.getLines().size()).isEqualTo(5);
    }
}