package ch03;

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

        showSearchResult(search(), arr, value, count);
    }

    /**
     * 이진 탐색
     * 
     * @return  배열에 찾고자 하는 값이 있으면 인덱스값을, 없으면 -1을 반환
     */
    private int search() {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        System.out.println(start + " " + mid + " " + end);

        while (arr[mid] != value && start <= end) {
            if (arr[mid] < value) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;

            System.out.println(start + " " + mid + " " + end);
            count++;
        }

        count++;
        return (arr[mid] == value) ? mid : -1;
    }
}
