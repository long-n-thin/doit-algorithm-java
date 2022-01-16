package ch02;

import java.util.Random;

public class Ex02_01 {
	// Q1. 키, 사람 수를 난수로 생성하여 가장 큰 키를 출력하는 프로그램 작성
	public static int maxOf(int[] a){
	    int max = a[0];
	    for(int i=1; i<a.length; i++){
	      if(max < a[i])
	        max = a[i];
	    }
	    return max;
	  }

	public static void main(String[] args) {
		  Random rand = new Random();
		  int num = rand.nextInt(20) + 1;	// 1~20의 난수
		  int[] height = new int[num];
		  
		  System.out.println("사람수 : " + num);
		  for(int i=0; i<height.length; i++) {
			  height[i] = rand.nextInt(90) + 100;	// 100~189의 난수
			  System.out.println(" height[" + i + "] : " + height[i]);
		  }
		  
		  System.out.println("최댓값은 " + maxOf(height));
	}

}
