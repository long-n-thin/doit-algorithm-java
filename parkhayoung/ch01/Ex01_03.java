package ch01;

public class Ex01_03 {
	// Q3. �� ���� �ּڰ��� ���ϴ� min4 �޼��带 �ۼ��Ѵ�.
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(min > b) min = b;
		if(min > c) min = c;
		if(min > d) min = d;
		
		return min;
	}

	public static void main(String[] args) {
		System.out.println("5, 8, 3, 10 �� �ּڰ�? : " + min4(5,8,3,10));
	}
}
