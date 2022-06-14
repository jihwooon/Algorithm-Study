package demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Code01Test {

    public int func(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + func(n - 1);
        }
    }

    @Test
    void result() {
        assertThat(func(20)).isEqualTo(210);
        assertThat(func(10)).isEqualTo(55);
        assertThat(func(4)).isEqualTo(10);
    }

}
