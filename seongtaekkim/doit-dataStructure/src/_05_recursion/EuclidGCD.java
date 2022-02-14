package _05_recursion;

import java.util.Scanner;

public class EuclidGCD {
    static int gcd(int x, int y) {
        if(y==0)
            return x;
        else
            return gcd(y,x%y);
    }

    /**
     * q2 재귀 메서드 호출을 사요하지 않고 gcd 메서드를 작성해라.
     * @param x
     * @param y
     * @return
     */
    static int gcd2(int x, int y) {
        int tmp = 0;
        while(y!=0) {
            tmp = x % y;
            x = y;
            y = tmp;
        }
        return x;
    }

    /**
     * 배열 a의 모든 요소의 최대공약수를 구하는 다음 메서드를 작성하세요.
     * solution : n개의 자연수에 대해 n-1번 최대공약수를 구한다.
     * @param a
     * @return
     */
    static int gcdArray(int[] a) {
        if(a.length < 1)
            return -1;
        if(a.length == 1)
            return a[0];

        int x = a[0];
        int tmp = 0;
        for(int i=1 ; i<a.length ; i++) {
            while(a[i]!=0){
                tmp = x % a[i];
                x = a[i];
                a[i] = tmp;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        /*Scanner stdIn = new Scanner(System.in);
        System.out.println(4%6);
        System.out.println("두 정수의 최대공약수");
        System.out.print("첫번째 정수 입력 : ");
        int x = stdIn.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int y = stdIn.nextInt();

        System.out.println("최대공약수는 " + gcd(x,y) + "입니다.");
        System.out.println("최대공약수는 " + gcd2(x,y) + "입니다.");*/
        int[] data = new int[]{1,8,4};
        System.out.println("최대공약수는 " + gcdArray(data) + "입니다.");

    }
}
