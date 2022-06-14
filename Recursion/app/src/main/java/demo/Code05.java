package demo;

public class Code05 {

    //피보나치
    public static void main(String[] args) {
        int fibonacci = fibonacci(5);
        System.out.println(fibonacci);
    }

    public static int fibonacci(int n) {
        if(n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
