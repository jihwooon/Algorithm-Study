package demo;

public class Code01 {

    // 1 ~ n 까지의 합
    public static void main(String[] args) {
        int result = func(20);
        System.out.println("result : "+ result);
    }

    public static int func(int n) { // mission은 0 ~ n까지의 합을 구하는 것이다.
        if (n == 0) {
            return 0; // n=0 이라면 합은 0이다.
        } else {
            System.out.println("Hello...");
            return n+func(n-1); // n이 0보다 크다면 0에서 n까지의 합은 0에서 n - 1 까지의 합에 n을 더하는 것이다.
        }
    }
}
