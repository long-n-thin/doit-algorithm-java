package ch02;

import java.util.Random;

public class Ex02_01 {
	// Q1. Ű, ��� ���� ������ �����Ͽ� ���� ū Ű�� ����ϴ� ���α׷� �ۼ�
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
		  int num = rand.nextInt(20) + 1;	// 1~20�� ����
		  int[] height = new int[num];
		  
		  System.out.println("����� : " + num);
		  for(int i=0; i<height.length; i++) {
			  height[i] = rand.nextInt(90) + 100;	// 100~189�� ����
			  System.out.println(" height[" + i + "] : " + height[i]);
		  }
		  
		  System.out.println("�ִ��� " + maxOf(height));
	}

}
