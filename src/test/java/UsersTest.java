import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UsersTest {
    @Test
    void 사람_수가_4명이_넘으면_예외() {
        // when & then
        assertThatThrownBy(() ->
                new Users("1", "2", "3", "4", "5")
        ).isInstanceOf(RuntimeException.class);
    }

    @Test
    void 사람_수가_4명이면_생성() {
        // when & then
        assertDoesNotThrow(() -> new Users("1", "2", "3", "4"));
    }
}