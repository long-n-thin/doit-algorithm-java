package common;

public class CommonFunction {
    public static void printArr(int[] arr) {
        System.out.print("[");

        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i++]);

            if (i < arr.length) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void showSearchResult(int index, int[] arr, int value, int count) {
        if (index == -1) {
            System.out.println("The element " + value + " is not found.");
        } else {
            System.out.println("The element " + value + " is found at the index : " + index);
        }

        printArr(arr);
        System.out.println("It took " + count + " steps to end the process.");
    }
}
