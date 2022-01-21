package ch03;

import java.util.Random;

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

        showSearchResult(search(), arr, value, count);
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
        for (int i = 0; i < arr.length; i++) {
            count++;

            if (arr[i] == value) {
                return i;
            }
        }
        count++;

        return -1;
    }
}
