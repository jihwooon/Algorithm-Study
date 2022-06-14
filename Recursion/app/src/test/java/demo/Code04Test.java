package demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Code04Test {

    double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * Math.pow(x, n - 1);
    }

    @Test
    void result() {
        assertThat(power(2, 3)).isEqualTo(8);
        assertThat(power(2, 0)).isEqualTo(1);
    }
}
