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

    public static void printArr(int[] arr, int index) {
        System.out.print("[");

        int i = 0;
        while (i < arr.length) {
            if (i == index) {
                System.out.print("*");
            }
            System.out.print(arr[i++]);

            if (i < arr.length) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printArr(int[] arr, int start, int mid, int end) {
        System.out.print("[");

        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (i == start) {
                System.out.print("<-");
            }
            if (i == mid) {
                System.out.print("*");
            }
            System.out.print(arr[i]);
            if (i == end) {
                System.out.print("->");
            }
            if (i + 1 < arr.length) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void showSearchResult(int index, int[] arr, int value, int count) {
        if (index < 0) {
            System.out.println("The element " + value + " is not found.");

            // Q6
            if (index < -1) {
                System.out.println("Insertion Point : " + -(++index));
            }
        } else {
            System.out.println("The element " + value + " is found at the index : " + index);
        }

        if (count > 0) {
            System.out.println("It took " + count + " steps to end the process.");
        }

        printArr(arr, index);
        System.out.println();
    }
}
