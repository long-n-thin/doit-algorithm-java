package ch03;

import java.util.Random;
import java.util.stream.IntStream;

import static common.CommonFunction.printArr;

/**
 * 선형 검색 구현
 */
public class LinearSearch {
    /**
     * @param length 배열 길이
     * @param bound  배열에 들어갈 수 있는 최대값
     * @param value  찾고자 하는 값
     */
    public static void run(int length, int bound, int value) {
        int[] arr = new int[length];
        insertRandomNumber(arr);

        // Java 8
        int[] arr1 = IntStream.generate(() -> new Random().nextInt(bound) + 1).distinct().limit(length).toArray();
        int[] arr2 = new Random().ints(1, bound).distinct().limit(length).toArray();

        showSearchResult(arr, value);
        showSearchResult(arr1, value);
        showSearchResult(arr2, value);
    }

    /**
     * @param arr   탐색할 배열
     * @param value 찾고자 하는 값
     */
    private static void showSearchResult(int[] arr, int value) {
        int index = search(arr, value);

        if (index == -1) {
            System.out.println("The element " + value + " is not found.");
        } else {
            System.out.println("The element " + value + " is found at the index : " + index);
        }

        printArr(arr);
    }

    /**
     * 중복되지 않는 임의의 값 삽입
     *
     * @param arr 임의의 값을 넣어줄 배열
     */
    private static void insertRandomNumber(int[] arr) {
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
     * @param arr   탐색할 배열
     * @param value 찾고자 하는 값
     * @return 배열에 찾고자 하는 값이 있으면 인덱스를, 없으면 -1을 반환
     */
    private static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
