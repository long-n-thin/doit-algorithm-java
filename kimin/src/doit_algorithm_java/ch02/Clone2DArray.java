package doit_algorithm_java.ch02;

public class Clone2DArray {
    public static void run(int[] arr, int[][] arr2d) {
        clone2dArray(arr, arr2d);
    }

    private static void clone2dArray(int[] arr, int[][] arr2d) {
        int[] arrClone = arr.clone();

        System.out.println("a: " + arr);
        System.out.println("b: " + arrClone);

        int[][] arr2dClone = arr2d.clone();

        System.out.println("c: " + arr2d);
        System.out.println("d: " + arr2dClone);
        System.out.println("c[0]: " + arr2d[0]);
        System.out.println("d[0]: " + arr2dClone[0]);
    }
}
