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

        new LinearSearch(arr, value);
        new LinearSearch(arr2, value);

        new LinearSearch(sortedArr, value);
        new BinarySearch(sortedArr, value);
    }
}
