package ch02;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayRandomAll {
    public static void run(int numOfPeople) {
        Random rand = new Random();

        int count = rand.nextInt(numOfPeople) + 1;
        int[] heights = new int[count];

        System.out.println("사람수: " + count);

        IntStream.range(0, count)
                .forEach(i -> {
                    heights[i] = rand.nextInt(60) + 150;
                    System.out.printf("사람%d 키: %d\n", i + 1, heights[i]);
                });
    }
}
