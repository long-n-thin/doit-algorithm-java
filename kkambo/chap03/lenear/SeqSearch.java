package kkambo.chap03.lenear;

import java.util.Scanner;

public class SeqSearch {

    /**
     * @param a   값을 찾을 배열
     * @param n   배열의 길이(요솟수)
     * @param key 찾을 키값
     * @return -1 값이 없음 / 찾는 값이 있는 index
     */
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if (i == n) {
                return -1;
            }
            if (a[i] == key) {
                return i;
            }

            i++;
        }
    }

    static int seqSearchFor(int[] a, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key)
                return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟 수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값");
        int ky = stdIn.nextInt();

        int idx = seqSearch(x, num, ky);

        if (idx == -1)
            System.out.println("찾는 값이 없습니다.");
        else
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
    }
}
