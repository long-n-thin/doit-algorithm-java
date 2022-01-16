package ch01;

public class Ex01_04 {
	// Q4. 세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성한다.
	static int median3(int a, int b, int c) {
		if (a >= b)
			if (b >= c) return b;
			else if (a <= c) return a;
			else return c;
		else if (a > c) return a;
		else if (b > c) return c;
		else return b;
	}

	public static void main(String[] args) {
		System.out.println("5, 8, 3의 중앙값? : " + median3(5,8,3));
	}
}
