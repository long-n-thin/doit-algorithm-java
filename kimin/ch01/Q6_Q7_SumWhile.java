package kimin.ch01;

import java.util.Scanner;

class Q6_Q7_SumWhile {
    public static void main(String[] args) {
        System.out.println("1부터 n까지 합 구하기");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        
        System.out.println("1부터 " + n + "까지 합은 " + sumWhile(n) + "입니다.");
    }

    private static int sumWhile(int n) {
        int sum = 0;
        int i = 1;

        System.out.print(i);
        while(i <= n) {
            sum += i;
            i++;
            
            if (i <= n) {
                System.out.print("+" + i);
            }
        }
        System.out.println("=" + sum);
        System.out.println("while문 종료, i = " + i + ", n = " + n);

        return sum;
    }
}
