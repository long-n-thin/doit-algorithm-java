package ch01;

public class Ex01_04 {
	// Q4. �� ���� ��� ���� 13������ ��� ���տ� ���� �߾Ӱ��� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ѵ�.
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
		System.out.println("5, 8, 3�� �߾Ӱ�? : " + median3(5,8,3));
	}
}
