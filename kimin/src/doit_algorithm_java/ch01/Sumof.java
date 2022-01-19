package doit_algorithm_java.ch01;

public class Sumof {
    public static void run(int a, int b) {
        System.out.println("a와 b 사이 정수의 합 구하기");

        System.out.printf("a: %d, b: %d", a, b);

        System.out.printf("%d와 %d 사이 정수의 합은 %d입니다.\n", a, b, sumofWhile(a, b));
        System.out.printf("가우스의 덧셈 공식 이용: %d", sumofFormula(a, b));
    }

    private static int sumofWhile(int a, int b) {
        int sum = 0;
        if (a < b) {
            while (a <= b) {
                sum += a++;
            }
        } else {
            while (a >= b) {
                sum += a--;
            }
        }

        return sum;
    }

    private static int sumofFormula(int a, int b) {
        int count;

        if (a > b) {
            count = a - b + 1;
        } else {
            count = b - a + 1;
        }

        return count*(a+b)/2;
    }
}
