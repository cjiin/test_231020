package 문제4번;
// 반복문 사용
public class FactorialExample {
    public static void main(String[] args) {
        int n = 1000000;
        long result = factorial(n);
        System.out.println(result);
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1; // result 를 1로 초기화
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
