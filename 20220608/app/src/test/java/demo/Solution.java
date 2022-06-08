package demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;

public class Solution {

    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (d[i] <= budget) {
                budget = budget - d[i];
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }

    @Test
    void result() {
        assertThat(solution(new int[]{1, 3, 2, 5, 4}, 9)).isEqualTo(3);
        assertThat(solution(new int[]{2, 2, 3, 3}, 10)).isEqualTo(4);
    }
}
