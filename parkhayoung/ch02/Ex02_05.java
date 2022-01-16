package ch02;

import java.util.Arrays;

public class Ex02_05 {
	// Q5. 배열b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 작성
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
