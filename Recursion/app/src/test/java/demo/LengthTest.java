package demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LengthTest {

    private int length(String str) {

        if (str.equals(" ")) {
            return 0;
        } else {
            return 1 + length(str.substring(1));
        }
    }


    @Test
    void result() {
        assertThat(length("ace")).isEqualTo(3);
        assertThat(length(" ")).isEqualTo(0);
    }

}
