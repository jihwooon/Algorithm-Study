package demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class sumTest {

    //data[0] 에서 data[n-1]까지의 합을 구하여 반환하라.
    private int sum(int n, int[] data) {

        if (n <= 0) {
            return 0;
        }

        return sum(n - 1, data) + data[n - 1];
    }

    @Test
    void result() {
        assertThat(sum(3, new int[]{1, 2, 3, 4})).isEqualTo(6);
        assertThat(sum(4, new int[]{1, 2, 3, 4})).isEqualTo(10);
    }

}
