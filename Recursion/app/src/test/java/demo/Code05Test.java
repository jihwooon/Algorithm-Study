package demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Code05Test {


    private int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    @Test
    void result() {
        assertThat(fibonacci(5)).isEqualTo(5);
        assertThat(fibonacci(2)).isEqualTo(1);
        assertThat(fibonacci(1)).isEqualTo(1);
        assertThat(fibonacci(0)).isEqualTo(0);
        assertThat(fibonacci(-1)).isEqualTo(-1);
    }

}
