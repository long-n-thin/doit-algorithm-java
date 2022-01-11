package chap01;

import java.util.Scanner;

public class GausSum {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값 : ");

        int n = stdIn.nextInt();
        int sum = 0;

        //홀수랑 짝수를 구분한다.
        //짝수일 경우 (1 + 10) * 5
        //홀수 일 경우는
        boolean even = ( n % 2 == 0) ? true : false;

        if(even){
            sum = (1 + n)*(n/2);
        }else
        {
            sum = n;
            n = n - 1;
            sum += (1 + n)*(n/2);
        }

        System.out.println("합은 : " + sum);

    }
}
