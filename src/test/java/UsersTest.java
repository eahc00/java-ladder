import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UsersTest {
    @Test
    void 사람_수가_2명보다_적으면_예외() {
        // when & then
        assertThatThrownBy(() ->
                new Users("1")
        ).isInstanceOf(RuntimeException.class);
    }

    @Test
    void 사람_수가_2명_이상이면_생성() {
        // when & then
        assertDoesNotThrow(() -> new Users("1", "2", "3", "4"));
    }
}