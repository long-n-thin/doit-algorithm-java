package ch02;

import java.util.Arrays;

public class Ex02_04 {
	// Q4. �迭b�� ��� ��Ҹ� �迭a�� �����ϴ� �޼��� �ۼ�
	static void copy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			a[i] = b[i];
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[5];
		int[] b = {10, 2, 5, 30, 74};
		copy(a, b);
		System.out.println(Arrays.toString(a));
	}

}
