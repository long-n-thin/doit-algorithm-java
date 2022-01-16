package ch02;

import java.util.Scanner;

public class Ex02_02 {
	// Q2. 배열 요소를 역순으로 정렬하는 과정을 나타내는 프로그램 작성
	// 두 배열 요소 교환
	  static void swap(int[] a, int index1, int index2) {
		printArr(a);
	    int t = a[index1];
	    a[index1] = a[index2];
	    a[index2] = t;
	    System.out.println("a["+ index1 +"]와 a["+ index2 +"]를 교환합니다.");
	  }
	  
	  // 배열 출력
	  static void printArr(int[] a) {
		  for(int i=0; i<a.length; i++) {
			  System.out.print(a[i]+" ");
		  }
		  System.out.println();
	  }

	  // 배열 요소 역순으로 정렬
	  static void reverse(int[] a) {
	    for(int i=0; i<a.length/2; i++){
	      swap(a, i, a.length-i-1);
	    }
	  }

	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("배열 만들기");
	    System.out.print("요솟수 입력 : ");
	    int num = scan.nextInt();

	    int[] arr = new int[num];
	    
	    System.out.println("요소 입력");
	    for(int i=0; i<num; i++){
	      System.out.print("arr["+ i +"] : ");
	      arr[i] = scan.nextInt();
	    }
	    scan.close();
	    System.out.println();

	    reverse(arr);
	    
	    printArr(arr);
	    System.out.println("역순 정렬을 마쳤습니다.");
	   
	  }

}
