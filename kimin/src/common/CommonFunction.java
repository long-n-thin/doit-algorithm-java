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
}
