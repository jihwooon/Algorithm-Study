package demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PrintCharsTest {


    private String printChars(String str) {

        if(str.length() == 0) {
            return "";
        } else {
//            System.out.println(str.charAt(0));
            System.out.println("문자열 자르기 : " + str.substring(1));
            return printChars(str.substring(2));
        }


    }


    @Test
    void result() {
        assertThat(printChars("철수")).isEqualTo("");
//        assertThat(printChars("abcd")).isEqualTo("");
        assertThat(printChars("")).isEqualTo("");


    }

}
