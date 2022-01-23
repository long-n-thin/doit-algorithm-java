package ch01;

/**
 * Q8 가우스의 덧셈 방법을 이용한 1부터 n까지 합 구하기
 *
 * p.30
 *
 */
class GaussSum {
    public static void run(int n) {
        System.out.printf("가우스의 덧셈 방법: 1부터 %d까지의 합은 %d입니다.", n, gaussSum(n));
    }

    private static int gaussSum(int n) {
        return n*(1+n)/2;
    }
}
