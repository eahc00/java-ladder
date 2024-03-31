import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class UserTest {
    @Test
    void 사람_이름이_5글자를_넘으면_예외() {
        // when & then
        assertThatThrownBy(() ->
                new User("123456", 0)
        ).isInstanceOf(RuntimeException.class);
    }

    @Test
    void 사람_이름이_5글자_이내이면_생성() {
        // when & then
        assertDoesNotThrow(() -> new User("12345", 0));
    }
}