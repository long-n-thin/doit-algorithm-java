package ���Ͽ�.ch01;

public class Ex01_02 {
	// Q2. �� ���� �ּڰ��� ���ϴ� min3 �޼��带 �ۼ��Ѵ�.
	static int min3(int a, int b, int c) {
		int min = a;
		if(min > b) min = b;
		if(min > c) min = c;
		
		return min;
	}

	public static void main(String[] args) {
		System.out.println("5, 8, 3 �� �ּڰ� : " + min3(5,8,3));
	}
}
