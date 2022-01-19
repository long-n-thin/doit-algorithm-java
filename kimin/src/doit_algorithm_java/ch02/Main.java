package doit_algorithm_java.ch02;

import static doit_algorithm_java.common.CommonFunction.seperator;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[][] arr2d = {{1, 2, 3, 4}, {5, 6, 7}};

        Clone2DArray.run(arr, arr2d);
        seperator();
        ArrayRandomAll.run(10);
        seperator();
        ReverseArray.run(arr);
    }
}