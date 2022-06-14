package demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Code03Test {

    //Factorial : n!
    private int func(int n) {
        if (n == 0) {
            return 1;
        }
        return n * func(n - 1);
    }

    @Test
    void result() {
        assertThat(func(4)).isEqualTo(24);
        assertThat(func(2)).isEqualTo(2);
        assertThat(func(0)).isEqualTo(1);

    }
}
