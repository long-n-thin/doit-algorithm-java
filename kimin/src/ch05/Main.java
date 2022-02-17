package ch05;

public class Main {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int n = 5;

        int fRecur = f.factorialRecursion(n);
        int fIter = f.factorialIter(n); // TODO: Q1 팩토리얼 재귀 사용x

        System.out.println("팩토리얼 재귀: " + fRecur);
        System.out.println("팩토리얼 반복문: " + fIter);

        EuclidGCD ec = new EuclidGCD();
        int x = 12;
        int y = 24;

        int gcdRecur = ec.gcdRecursion(x, y);
        int gcdIter = ec.gcdIter(x, y);  // TODO: Q2 GCD(최대공약수) 재귀 사용x

        System.out.println("GCD 재귀: " + gcdRecur);
        System.out.println("GCD 반복문: " + gcdIter);

//        int[] arr = {16, 32, 24, 12, 8};
        int[] arr = new int[8000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }

        System.out.println("GCD 배열: " + ec.gcdArray(arr));    // TODO: Q3 배열에 있는 모든 정수의 GCD
//        System.out.println("GCD 배열 답안: " + ec.gcdArraySol(arr, 0, arr.length));    // Q3 답안 - 배열 크기가 얼마 이상 커지면 StackOverflowError 뱉음
    }
}
