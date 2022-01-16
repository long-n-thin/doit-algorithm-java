package kimin.ch01;

class Q16_Pyramid {
    public static void main(String[] args) {
		printPyramid(5);
    }

	private static void printPyramid(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
