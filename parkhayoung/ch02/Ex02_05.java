package ch02;

import java.util.Arrays;

public class Ex02_05 {
	// Q5. �迭b�� ��� ��Ҹ� �迭 a�� �������� �����ϴ� �޼��� �ۼ�
	static void rcopy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			a[i] = b[b.length -1 - i];
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[5];
		int[] b = {10, 2, 5, 30, 74};
		rcopy(a, b);
		System.out.println(Arrays.toString(a));
	}

}
