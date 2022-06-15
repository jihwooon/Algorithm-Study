# Recursion vs. Iteration

* 모든 순환함수는 반복문(iteration)으로 변경 가능
* 그 역도 성립함. 즉 모든 반복문 recursion으로 표현 가능함
* 순환함수는 복잡한 알고리즘을 단순하고 알기쉽게 표현하는 것을 가능하게 함
* 하지만 함수 호출에 따란 오버해드가 있음 (매개변수 전달, 액티베이션 프레임 생성 등)

## 순환전 알고리즘 설계

* 적어도 하나의 base case, 즉 순환되지 않고 종료되고 case가 있어야 함
* 모든 case는 결국 base case로 수렴해야 함

암시적 매개변수를 명시적 매개변수(explicit)로 바꾸어라.

* 순차 탐색
```java
//이 함수의 미션은 data[0]에서 data[n-1] 사이에 target을 검색하는 것이다.
//하지만 검색 구간의 시작 인덱스 0은 보통 생략한다. 즉 암시적 매개변수이다. 
int search(int[]data,int n,int target){

    for(int i=0; i < n; i++) {
        if(data[i] == target){
            return i;
        }
    }
        return-1;
}


// 이 함수의 미션은 data[begin]에서 data[end] 사이에서 target을 검색한다. 
// 즉 검색구간의 시작점을 명시적으로 지정한다.
private int search_explicit(int[] data, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        } else if (target == items[begin]) {
                return begin;
        } else {
            return search(data, begin+1, target);
       }
    }
    
// 순차 탐색 : 다른 버전
int search(int [] data, int begin, int end, int target) {
    if (begin > end) {
        return -1;
    } else {
        int middle = (begin + end) / 2;
        if(data[middle] == target) {
            return middle;
        }
        int index = search(data, begin, middle-1, target);
        if (index != 1) {
            return index;
        } else {
            return search(data, middle+1, end, target);
        }
        
    }
}

```

* 최대값 찾기
```java
//매개변수의 명시화 : 최대값 찾기
int findMax(int [] data, int begin, int end) {
    if (begin == end) {
        return data[begin];    
    } else {
        return Math.max(data[begin], findMax(data, begin+1, end));    
    }
}

// 최대값 찾기 : 다른버전
int findMax(int [] data, int begin, int end) {
    if (begin == end ) {
        return data[begin];
    } else {
        int middle = (begin + end) /2;
        int max1 = findMax(data, begin, middle);
        int max2 = findMax(data, middle+1, end);
        return Math.max(max1, max2);
    }
}

```

* Binary Search
```java
public static int binarySearch(String[] items, String target, int begin, int end) {
    if(begin > end) {
        return -1;
    } else {
        int middle = (begin + end) /2;
        int compResult = target.compareTo(items[middle]);
        if(compResult == 0) {
            return middle;
    } else if(compResult < 0) {
        return binarySearch(items, target, begin, middle-1);
    } else {
        return binarySearch(items, target, begin, middle+1, end);
    } 
        
        
    }
    
}

```

