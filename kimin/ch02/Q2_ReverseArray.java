package kimin.ch02;

import java.util.stream.IntStream;

class Q2_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        printArr(arr);
        reverse(arr);
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        IntStream.range(0, arr.length - 1)
            .forEach(i -> {
                
            });
    }

    private static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i ++) {
            swap(arr, i, arr.length - 1);
        }
    }

    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
