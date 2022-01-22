package ch03;

import java.util.Random;

import static common.CommonFunction.printArr;
import static common.CommonFunction.showSearchResult;

public class LinearSearch {
    private int[] arr;
    private int value;
    private int count = 0;

    public LinearSearch(int[] arr, int value) {
        if (arr[0] == 0) {
            insertRandomNumber(arr);
        }

        this.arr = arr;
        this.value = value;
    }

    public void run() {
        showSearchResult(search(), this.arr, this.value, this.count);
    }

    private void insertRandomNumber(int[] arr) {
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(arr.length * 2) + 1;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                }
            }
        }
    }

    /**
     * 선형 탐색
     *
     * @return 배열에 찾고자 하는 값이 있으면 인덱스를, 없으면 -1을 반환
     */
    private int search() {
        for (int i = 0; i < this.arr.length; i++) {
            // Q2
            printArr(this.arr, i);
            this.count++;

            if (this.arr[i] == this.value) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Q3
     */
    public void searchIdx() {
        int cnt = 0;
        int i = 0;
        int j = 0;
        int[] idxArr = new int[this.arr.length];

        while (i < this.arr.length) {
            if (this.arr[i] == this.value) {
                idxArr[j++] = i;
                cnt++;
            }
            i++;
        }

        System.out.println("Looking for: " + this.value);
        System.out.print("Given array: ");
        printArr(this.arr);
        System.out.print("Found index: ");
        printArr(idxArr);
        System.out.println("Value found: " + cnt);
    }
}
