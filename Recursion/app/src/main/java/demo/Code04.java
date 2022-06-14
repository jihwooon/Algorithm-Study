package demo;

public class Code04 {

    // x^0 = 1
    // x^n = x&x^n-1
    public static void main(String[] args) {

        double result = power(2, 3);
        System.out.println(result);
    }

    private static double power(double x, int n) {

        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }
}
