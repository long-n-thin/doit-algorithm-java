package ch03;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        int bound = length * 2;
        int value = 7;

        int[] arr = new int[length];

        // Java 8
        int[] arr2 = IntStream.generate(() -> new Random().nextInt(bound) + 1).distinct().limit(length).toArray();
        int[] sortedArr = new Random().ints(1, bound).distinct().limit(length).sorted().toArray();

//        // TODO: Q2 현재 검색중인 요소에 * 기호 표시(p.115)
        new LinearSearch(arr, value).run();
        new LinearSearch(arr2, value).run();

//        // TODO: Q3 배열에서 찾고자 하는 값의 총 요솟수(p.117)
        int[] arr3 = {1, 9, 9, 7, 8, 9};
//        int[] arr3 = new Random().ints(1, length).limit(length).toArray();
        new LinearSearch(arr3, value).searchIdx();

        new LinearSearch(sortedArr, value).run();
        // TODO: Q4 현재 검색중인 요소의 범위 표시(p.117)
        new BinarySearch(sortedArr, value).run();

        // TODO: Q6 검색 실패시 삽입 포인트 값 출력(p.121)
        new BinarySearch(sortedArr, value).javalib();
    }
}
