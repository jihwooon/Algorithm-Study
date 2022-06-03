package demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution {

    public String solution(String[] seoul) {

        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }

    @Test
    void result() {
        assertThat(solution(new String[]{"Jane", "Kim"})).isEqualTo("김서방은 1에 있다");
        assertThat(solution(new String[]{"Kim", "Jane"})).isEqualTo("김서방은 0에 있다");
        assertThat(solution(new String[]{"Jane", "Jane"})).isEqualTo("");
    }
}
