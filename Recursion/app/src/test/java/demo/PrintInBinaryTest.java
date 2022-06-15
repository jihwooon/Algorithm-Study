package demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintInBinaryTest {


    // 10진수 -> 2진법
    private String printInBinary(int n) {

        String str = "";

        while (n > 0) {
            str = n % 2 + str;
            n /= 2;
            System.out.print(str);
        }

        return str;
    }


    @Test
    void Result() {
//        Assertions.assertThat(printInBinary(0)).isEqualTo(0);
//        Assertions.assertThat(printInBinary(1)).isEqualTo(1);
//        Assertions.assertThat(printInBinary(2)).isEqualTo(1);
//        Assertions.assertThat(printInBinary(3)).isEqualTo(1);
//        Assertions.assertThat(printInBinary(4)).isEqualTo(1);
//        Assertions.assertThat(printInBinary(5)).isEqualTo("101");
//        Assertions.assertThat(printInBinary(11)).isEqualTo("1011");
        Assertions.assertThat(printInBinary(10)).isEqualTo("1010");

    }

}
