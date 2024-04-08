import static java.util.List.of;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
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

    @Test
    void 유저의_개인별_결과를_반환한다() {
        // given
        Users users = new Users("aa", "bb", "cc", "dd");
        Ladder ladder = new Ladder(users, 5,
                new TestBooleanGenerator(of(true, true, false, true, true, false, false, true, true, true)));
        User user = users.getUserByUsername("bb");
        // when
        ladder.playLadderGameForAllUsers(users);
        // then
        assertThat(user.getState()).isEqualTo(3);
    }

    @Test
    void 전체_유저의_결과를_반환한다() {
        // given
        Users users = new Users("aa", "bb", "cc", "dd");
        Ladder ladder = new Ladder(users, 5,
                new TestBooleanGenerator(of(true, true, false, true, true, false, false, true, true, true)));
        List<Integer> result = List.of(0, 3, 2, 1);
        // when
        ladder.playLadderGameForAllUsers(users);
        // then
        for (int i = 0; i < 4; i++) {
            User user = users.getUsers().get(i);
            assertThat(user.getState()).isEqualTo(result.get(i));
        }
    }
}