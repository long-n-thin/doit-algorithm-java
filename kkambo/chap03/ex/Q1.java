package kkambo.chap03.ex;

import java.util.Scanner;

/**
 * 실습 3-3의 seqSearchSen 메서드를 while문이 아니라
 * for문을 사용하여 수정한 프로그램을 작성하세요.
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if (idx == -1)
            System.out.println("찾는 값이 없습니다.");
        else
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");

    }

    private static int seqSearchSen(int[] x, int num, int ky) {

        for(int i = 0 ; i < num ;  i++ ){
            if(x[i] == ky)
                return i;
        }
        return -1;
    }
}
