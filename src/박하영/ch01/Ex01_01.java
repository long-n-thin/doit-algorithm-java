package ���Ͽ�.ch01;

public class Ex01_01 {
	//Q1. �� ���� �ִ��� ���ϴ� m4 �޼��带 �ۼ��Ѵ�.
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(max < b) max = b;
		if(max < c) max = c;
		if(max < d) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("5, 8, 7, 3 �� �ִ�? : " + max4(5,8,7,3));
	}
}
