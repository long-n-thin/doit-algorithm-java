package ch06;

import static common.CommonFunction.printArr;
import static common.CommonFunction.swap;

public class BubbleSort {
    public void sort(int[] a) {
        int[] cp = a.clone();
        int length = cp.length;
        int cnt = 0;
        int ecnt = 0;

        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                cnt++;
                if (cp[j - 1] > cp[j]) {
                    swap(cp, j - 1, j);
                    ecnt++;
                }
            }
        }

        System.out.printf("버블 정렬1: 비교 %d회, 교환 %d회 ", cnt, ecnt);
        printArr(cp);
    }

    public void sort1(int[] a) {
        int[] cp = a.clone();
        int length = cp.length;
        boolean exchange = false;
        int cnt = 0;
        int ecnt = 0;

        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                cnt++;
                if (cp[j - 1] > cp[j]) {
                    swap(cp, j - 1, j);
                    exchange = true;
                    ecnt++;
                }

                if (!exchange) break;
            }
        }

        System.out.printf("버블 정렬2: 비교 %d회, 교환 %d회 ", cnt, ecnt);
        printArr(cp);
    }

    public void sort2(int[] a) {
        int[] cp = a.clone();
        int length = cp.length;
        int k = 0;
        int cnt = 0;
        int ecnt = 0;

        while (k < length - 1) {
            int last = length - 1;

            for (int i = length - 1; i > k; i--) {
                cnt++;
                if (cp[i - 1] > cp[i]) {
                    swap(cp, i - 1, i);
                    last = i;
                    ecnt++;
                }
            }

            k = last;
        }

        System.out.printf("버블 정렬3: 비교 %d회, 교환 %d회 ", cnt, ecnt);
        printArr(cp);
    }
}
