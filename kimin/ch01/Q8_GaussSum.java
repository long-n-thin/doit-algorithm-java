package kimin.ch01;

import java.util.Scanner;

class Q8_GaussSum {
    public static void main(String[] args) {
        System.out.println("가우스의 덧셈 방식을 이용한 1부터 n까지 합 구하기");

        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();

        System.out.println("1부터 " + n + "까지의 합은 " + gaussSum(n) + "입니다.");
    }

    private static int gaussSum(int n) {
        return n*(1+n)/2;
    }
}
