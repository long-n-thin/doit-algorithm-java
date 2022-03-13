package ch06;

import static common.CommonFunction.printArr;

public class Main {
    public static void main(String[] args) {
        int[] a = {6, 4, 3, 7, 1, 9, 8};
        System.out.print("정렬 전: ");
        printArr(a);

        BubbleSort bs = new BubbleSort();
        bs.sort(a);
        bs.sort1(a);
        bs.sort2(a);

        SelectionSort ss = new SelectionSort();
        ss.sort(a);

        InsertionSort is = new InsertionSort();
        is.sort(a);
    }
}
