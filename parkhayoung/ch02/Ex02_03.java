package ch02;

import java.util.Arrays;

public class Ex02_03 {
	// Q3. �迭 ����� �հ踦 ���Ͽ� ��ȯ�ϴ� �޼��� �ۼ�
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 8, 12, 20, 76};
		System.out.println("arr �迭 �� ���ϱ�");
		System.out.println(Arrays.toString(arr));
		System.out.println("�� : "+sumOf(arr));
	}

}
