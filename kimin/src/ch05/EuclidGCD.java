package ch05;

import java.util.Optional;

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
        int res = gcdIter(arr[0], (arr.length > 1) ? arr[1] : 0);

        for (int i = 2; i < arr.length - 1; i++) {
            res = gcdIter(res, arr[i]);
        }

        return res;
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
