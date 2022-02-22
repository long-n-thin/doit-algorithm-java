package ch05;

public class Factorial {
    public int factorialRecursion(int n) {
        if (n > 0) {
            return n * factorialRecursion(n - 1);
        } else {
            return 1;
        }
    }

    public int factorialIter(int n) {
        for (int i = n - 1; i > 0; i--) {
            n *= i;
        }

        return n;
    }
}
