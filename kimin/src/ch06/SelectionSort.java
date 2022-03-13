package ch06;

import static common.CommonFunction.printArr;
import static common.CommonFunction.swap;

public class SelectionSort {
    public void sort(int[] a) {
        int[] cp = a.clone();
        int length = cp.length;

        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (cp[j] < cp[min]) {
                    min = j;
                }
            }
            swap(cp, i, min);
        }

        System.out.print("단순 선택 정렬: ");
        printArr(cp);
    }
}
