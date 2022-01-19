package kkambo.chap03.lenear;

import java.util.Scanner;

public class SeqSearchSen {

    /**
     * 보초법(sentinel method)
     *
     * @param a 검색할 배열
     * @param n 배열 갯수
     * @param key 찾을 값
     * @return
     */
    static int seqSearchSen(int[] a, int n, int key){
        int i = 0;
        a[n] = key;

        while(true){
            if(a[i] == key)
                break;
            i++;
        }

        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값");
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if (idx == -1)
            System.out.println("찾는 값이 없습니다.");
        else
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");

    }
}
