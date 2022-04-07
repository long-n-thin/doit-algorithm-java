package _05_recursion;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n) {
        if(n > 0)
            return n * factorial(n-1);
        else
            return 1;
    }

    /**
     * q1 재귀메서드 호출을 사용하지 않고 factorial 메서드를 작성해라
     * @param n
     * @return
     */
    static int factorial2(int n) {
        int ret = 1;
        while(n!=1) {
            ret = ret * n--;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int x = stdIn.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
        System.out.println(x + "의 팩토리얼은 " + factorial2(x) + "입니다.");
    }


}
