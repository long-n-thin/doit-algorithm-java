package ch02;

import static common.CommonFunction.swap;

public class ReverseArray {
    public static void run(int[] arr) {
        printArr(arr);
        reverse(arr);
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i ++) {
            swap(arr, i, arr.length - i - 1);
        }
    }
}
