package chap01;

import java.util.Scanner;

public class ForExQ7 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = 0;

        for(int i = 0; i <= n ; i++) {
            sum += i;


            if(i < n-1) {
                System.out.print(i + 1);
                System.out.print(" + ");
            }
            else if(i < n) {
                System.out.print(i + 1);
                System.out.print(" = ");
            }
            else if(i==n)
                System.out.println(sum);
        }

    }
}
