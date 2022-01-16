package ch02;

import java.util.Scanner;

public class Ex02_02 {
	// Q2. �迭 ��Ҹ� �������� �����ϴ� ������ ��Ÿ���� ���α׷� �ۼ�
	// �� �迭 ��� ��ȯ
	  static void swap(int[] a, int index1, int index2) {
		printArr(a);
	    int t = a[index1];
	    a[index1] = a[index2];
	    a[index2] = t;
	    System.out.println("a["+ index1 +"]�� a["+ index2 +"]�� ��ȯ�մϴ�.");
	  }
	  
	  // �迭 ���
	  static void printArr(int[] a) {
		  for(int i=0; i<a.length; i++) {
			  System.out.print(a[i]+" ");
		  }
		  System.out.println();
	  }

	  // �迭 ��� �������� ����
	  static void reverse(int[] a) {
	    for(int i=0; i<a.length/2; i++){
	      swap(a, i, a.length-i-1);
	    }
	  }

	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("�迭 �����");
	    System.out.print("��ڼ� �Է� : ");
	    int num = scan.nextInt();

	    int[] arr = new int[num];
	    
	    System.out.println("��� �Է�");
	    for(int i=0; i<num; i++){
	      System.out.print("arr["+ i +"] : ");
	      arr[i] = scan.nextInt();
	    }
	    scan.close();
	    System.out.println();

	    reverse(arr);
	    
	    printArr(arr);
	    System.out.println("���� ������ ���ƽ��ϴ�.");
	   
	  }

}
