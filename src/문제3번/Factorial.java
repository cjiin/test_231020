package 문제3번;

public class Factorial {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // 0!와 1!은 1이므로 1을 반환
        } else {
            return n * factorial(n - 1); // n! = n * (n-1)!
        }
    }
}
