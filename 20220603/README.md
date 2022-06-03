# 어떻게 문제를 풀 것인가?
## 1. 문제에 대한 이해

- **우리가 풀어야 할 문제는 무엇인가?**
    - 서울에 김서방 찾기
- **주어진 자료는 무엇인가?**
    - seoul 배열에 Kim 들어가 있으면 반환한다.
    - "Kim"의 위치 x를 찾아,"김서방은 x에 있다”
    - seoul에 "Kim"은 오직 한 번만 나타나야 한다.
    - seoul은 길이 1 이상, 1000 이하인 배열입니다.
    - seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
    - "Kim"은 반드시 seoul 안에 포함되어 있습니다.
- **조건은 무엇인가?**
    - "Kim"의 위치 x를 찾아,"김서방은 x에 있다”
    - seoul 배열 안에 Kim 두 개 이상 들어가서는 안된다.

## 2. 계획

- 전에 비슷한 문제를 알고 있는가?
    - 비슷한 문제는 없다.
- 이 문제를 푸는데 있어서 유용하게 쓸 수 있는 지식은 무엇인가?
    - 배열을 길이를 구하기 위해서  for문을 사용 할 것이다.
    - `equals` 를 사용해서 위치 정보와 이름을 동일하게 한다.

1. for문으로 `[i]` 위치를 찾아줍니다.
2. `[i]` 와 “Kim”을 `equles` 를 해서 동일하게 합니다.
3. answer로 `"김서방은 " + i+ "에 있다";` 반환 해줍니다.

## 3. 실행

- 풀이 계획을 실행하고, 각 단계가 올바른지 점검하라.

```java  
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
```

## 4. 반성

- 문제를 다른 방식으로 해결할 수 있는가?
    - foreach문을 사용해서 해결해 볼 수 있을 것 같다.
    - HashMap을 사용 해볼 수 있을 것 같다.

처음에 문제를 보고 HashMap을 사용해서 Key 와 Value를 이용해서 Kim을 등록을 하려고 했었다. 막상 문제를 단순하게 보니 for문으로만으도 풀 수 있는 문제를 지문을 읽고 조건을 만으로 많은 것을 생각하게 되니 오히려 문제를 볼 때 방해가 되는 것 같다.

단순하게 쪼개는 연습을 하면서 하나씩 풀어가는 연습을 계속해서 해야 겠다. 아직까지 코테문제가 어떻게 구성이 되고 어떻게 풀어야 할 지 감이 통 안 잡혀서 비슷한 유형과

[코딩테스트 연습 - 서울에서 김서방 찾기](https://programmers.co.kr/learn/courses/30/lessons/12919)
