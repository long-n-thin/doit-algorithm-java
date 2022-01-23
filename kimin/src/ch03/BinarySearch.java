package ch03;

import java.util.Arrays;

import static common.CommonFunction.printArr;
import static common.CommonFunction.showSearchResult;

public class BinarySearch {
    private int[] arr;
    private int value;
    private int count = 0;

    /**
     * @param arr   값을 찾으려는 배열
     * @param value 찾고자 하는 값
     */
    public BinarySearch(int[] arr, int value) {
        this.arr = arr;
        this.value = value;
    }

    public void run() {
        showSearchResult(search(), this.arr, this.value, this.count);
    }

    public void javalib() {
        showSearchResult(javaAPIbinarySearch(), this.arr, this.value, this.count);
    }

    /**
     * 이진 탐색
     *
     * @return 배열에 찾고자 하는 값이 있으면 인덱스값을, 없으면 -1을 반환
     */
    private int search() {
        int start = 0;
        int end = this.arr.length - 1;

        while (start <= end) {
            this.count++;

            int mid = (start + end) / 2;
            System.out.println(start + " " + mid + " " + end);

            // Q4
            printArr(this.arr, start, mid, end);

            if (this.arr[mid] < this.value) {
                start = mid + 1;
            } else if (this.arr[mid] > this.value) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    /**
     * 자바 API Arrays.binarySearch 사용한 이진 검색
     *
     * @return 배열에 찾고자 하는 값이 있으면 인덱스값을, 없으면 -(삽입 포인트)-1을 반환
     */
    private int javaAPIbinarySearch() {
        return Arrays.binarySearch(this.arr, this.value);
    }
}
