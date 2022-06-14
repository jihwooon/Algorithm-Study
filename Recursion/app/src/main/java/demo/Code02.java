package demo;

public class Code02 {

    public static void main(String[] args) { // 무한 루프 발생하지 않음
        func(5);
    }

    public static void func(int k) {
        if (k <= 0) { // Base case : 적어도 하나의 recursion에 빠지지 않은 경우가 존재해야 한다.
            return;
        } else {
            System.out.println("Hello...");
            func(k - 1); // Recursive case : recursion을 반복하다보면 결국 base case로 수렴해야 한다.
        }
    }
}
