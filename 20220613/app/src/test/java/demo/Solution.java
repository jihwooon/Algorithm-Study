package demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution {

    public int solution(int[][] sizes) {
        int max_row = 0;
        int max_col = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if (max_row < sizes[i][0]) max_row = sizes[i][0];
            if (max_col < sizes[i][1]) max_col = sizes[i][1];
        }
        return max_col * max_row;
    }

    @Test
    void result() {
        assertThat(solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}})).isEqualTo(4000);
        assertThat(solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}})).isEqualTo(120);
        assertThat(solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}})).isEqualTo(133);

    }
}
