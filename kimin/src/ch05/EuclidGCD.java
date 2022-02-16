package ch05;

public class EuclidGCD {
    public int gcdRecursion(int x, int y) {
        return (y == 0) ? x : gcdRecursion(y, x % y);
    }

    public int gcdIter(int x, int y) {
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }

        return x;
    }

    public int gcdArray(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } else {
            int res = gcdIter(arr[0], arr[1]);

            for (int i = 2; i < arr.length; i++) {
                res = gcdIter(res, arr[i]);
            }

            return res;
        }
    }

    public int gcdArraySol(int[] arr, int i, int length) {
        if (length == 1) {
            return arr[i];
        } else if (length == 2) {
            return gcdIter(arr[i], arr[i + 1]);
        } else {
            return gcdIter(arr[i], gcdArraySol(arr, i + 1, length - 1));
        }
    }
}
