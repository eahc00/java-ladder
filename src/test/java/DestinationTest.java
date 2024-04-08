import static java.util.List.of;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class DestinationTest {
    @Test
    void 실행_결과가_유저_수와_다르면_에러() {
        // given
        Users users = new Users(of("aa", "bb", "cc", "dd"));
        // when & then
        assertThatThrownBy(() ->
                new Destination(users, of("11", "22", "33"))
        ).isInstanceOf(RuntimeException.class);
    }

}