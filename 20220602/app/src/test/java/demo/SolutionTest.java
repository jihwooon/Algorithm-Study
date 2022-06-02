package demo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    public int[] solution(int N, int[] stages) {
        int[] stageStatus = new int[N+1];
        for(int num : stages) {
            if(num == N+1) continue;
            stageStatus[num]++;
        }

        Map<Integer, Double> res = new HashMap<>();
        int total = stages.length;
        for(int i=1; i<N+1; i++) {
            if(total==0) {
                res.put(i, (double)0);
            }
            else {
                double rate = (double)stageStatus[i]/(double)total;
                total-=stageStatus[i];
                res.put(i, rate);
            }
        }

        List<Integer> list = new ArrayList<>(res.keySet());
        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return Double.compare(res.get(o2), res.get(o1));
            }
        });

        int[] answer = new int[N];
        for(int i=0; i<N; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    @Test
    void result() {
        assertThat(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})).isEqualTo(new int[]{3,4,2,1,5});
        assertThat(solution(4, new int[]{4,4,4,4,4})).isEqualTo(new int[]{4,1,2,3});
    }

}
