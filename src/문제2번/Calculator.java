package 문제2번;

public class Calculator {

    private int result;

    public Calculator add(int num) {
        result += num;
        return this;
    }

    public Calculator subtract(int num) {
        result -= num;
        return this;
    }

    public int out() {
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(4).add(5).subtract(3).out();
        System.out.println(result); // 출력 결과는 6입니다.
    }

}

