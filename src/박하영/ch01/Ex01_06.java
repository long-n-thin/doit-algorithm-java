package ���Ͽ�.ch01;

import java.util.Scanner;

public class Ex01_06 {

	public static void main(String[] args) {
		// Q6. �ǽ� 1-4���� while���� ����� �� ���� i ���� n + 1�� ���� Ȯ���Ѵ�.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1���� n������ ��");
	    System.out.print("n�� ��: ");
	    int n = scan.nextInt();
	    scan.close();

	    int sum = 0;
	    int i = 1;
	    while (i <= n) {
	      sum += i;
	      i++;
	    }
	    
	    System.out.println("1���� " + n + "������ �� : " + sum);
	    System.out.println("i : " + i);
	}
}
