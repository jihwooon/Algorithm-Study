package demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Code06Test {

    private int gcd(int m, int n) {
        if (m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }

        if (m == n) {
            return 0;
        }

        if (m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }

    @Test
    void result() {
        assertThat(gcd(10, 3)).isEqualTo(1);
        assertThat(gcd(3, 2)).isEqualTo(1);
        assertThat(gcd(3, 3)).isEqualTo(0);
        assertThat(gcd(3, 4)).isEqualTo(gcd(4, 3)); //m < n 클 경우 n < m 변경
        assertThat(gcd(3, 4)).isEqualTo(gcd(4, 3)); //m < n 클 경우 n < m 변경

    }
}
