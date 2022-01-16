package ch02;

import java.util.Arrays;

public class Ex02_03 {
	// Q3. 배열 요소의 합계를 구하여 반환하는 메서드 작성
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 8, 12, 20, 76};
		System.out.println("arr 배열 합 구하기");
		System.out.println(Arrays.toString(arr));
		System.out.println("합 : "+sumOf(arr));
	}

}
