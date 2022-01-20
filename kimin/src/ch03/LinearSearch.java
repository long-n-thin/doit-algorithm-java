package ch03;

import java.util.Random;

import static common.CommonFunction.printArr;

/**
 * 선형 검색 구현
 */
public class LinearSearch {
    /**
     * @param length 배열의 길이
     * @param value  찾고자 하는 값
     */
    public static void run(int length, int value) {
        int[] arr = new int[length];

        insertRandomNumber(arr);
        search(arr, value);
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
     * @param arr   선형검색 할 배열
     * @param value 찾고자 하는 값
     * @return 배열에 찾으려는 값이 있으면 인덱스를, 없으면 1을 반환
     */
    private static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("The element is found at the index : " + arr[i]);
                return i;
            }
        }
        System.out.println("The element " + value + " is not found.");
        return -1;
    }
}
