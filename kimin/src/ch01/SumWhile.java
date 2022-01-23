package ch01;

/**
 * Q6, Q7
 * 1부터 n까지 합 구하기
 */
class SumWhile {
    public static void run(int n) {
        System.out.printf("while문: 1부터 %d까지 합은 %d입니다.", n, sumWhile(n));
    }

    private static int sumWhile(int n) {
        int sum = 0;
        int i = 1;

        System.out.print(i);
        while(i <= n) {
            sum += i;
            i++;
            
            if (i <= n) {
                System.out.print("+" + i);
            }
        }
        System.out.println("=" + sum);
        System.out.println("while문 종료, i = " + i + ", n = " + n);

        return sum;
    }
}
