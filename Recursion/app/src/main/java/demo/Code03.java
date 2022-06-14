package demo;

public class Code03 {

    //Factorial : n!
    public static void main(String[] args) {
        int result = func(4);
        System.out.println(result);
    }

    public static int func(int k) {
        if (k == 0) {
            return 1;
        } else {
            return k * func(k - 1);
        }

    }
}
