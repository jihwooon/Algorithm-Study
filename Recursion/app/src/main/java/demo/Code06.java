package demo;

public class Code06 {

    //최대 공약수
    public static void main(String[] args) {
        int gcd = gcd(10, 3);
        System.out.println(gcd);
    }

    private static int gcd(int m, int n) {
        if (m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        if (m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }
}
