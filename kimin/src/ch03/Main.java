package ch03;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        int bound = length * 2;
        int value = 7;

        LinearSearch.run(length, bound, value);
    }
}
