package demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Search {

    private int[] items = {1,2,3,4,5};

    private int search(int[] data, int n, int target) {

        for (int i = 0; i < n; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // 이 함수의 미션은 data[begin]에서 data[end] 사이에서 target을 검색한다. 즉 검색구간의 시작점을 명시적으로 지정한다.
    private int search_explicit(int[] data, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        } else if (target == items[begin]) {
            return begin;
        } else {
            return search(data, begin+1, target);
        }
    }

    private int search_different(int [] data, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        } else {
            int middle = (begin + end) / 2;
            if(data[middle] == target) {
                return middle;
            }
            int index = search_different(data, begin, middle-1, target);
            if (index != 1) {
                return index;
            } else {
                return search_different(data, middle+1, end, target);
            }

        }
    }

    @Test
    void result() {

        assertThat(search(new int[]{1,2,5,6,8,9,2}, 5,  3)).isEqualTo(-1);
//        assertThat(search_explicit(new int[]{1,2,5,6,8,9,2}, 1, 4, 3)).isEqualTo(5);
//        assertThat(search_different(new int[]{1,2,5,6,8,9,2}, 5, 1, 4)).isEqualTo(-1);
//        assertThat(search_different(new int[]{1,2,5,6,8,9,2,2,3,5,7}, 2, 10, 4)).isEqualTo(2);
    }
}
