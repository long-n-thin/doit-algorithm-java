package kimin.ch02;

import java.util.Random;
import java.util.stream.IntStream;

class Q1_ArrayRandomAll {
    public static void main(String[] args) {
        arrayRandomAll();
    }

    private static void arrayRandomAll() {
        Random rand = new Random();

        int numOfPeople = rand.nextInt(10) + 1;
        int[] heights = new int[numOfPeople];

        System.out.println("사람수: " + numOfPeople);

        IntStream.range(0, numOfPeople)
            .forEach(i -> {
                heights[i] = rand.nextInt(60) + 150;
                System.out.printf("사람%d 키: %d\n", i+1, heights[i]);
            });
    }
}
