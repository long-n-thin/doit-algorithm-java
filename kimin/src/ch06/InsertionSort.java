package ch06;

import static common.CommonFunction.printArr;

public class InsertionSort {
    public void sort(int[] a) {
        int[] cp = a.clone();
        int length = cp.length;

        for (int i = 1; i < length; i++) {
            int j;
            int temp = cp[i];

            for (j = i; j > 0 && cp[j-1] > temp; j--) {
                cp[j] = cp[j-1];
            }

            cp[j] = temp;
        }

        System.out.print("단순 삽입 정렬: ");
        printArr(cp);
    }
}
