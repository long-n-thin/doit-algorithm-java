package ���Ͽ�.ch01;

import java.util.Scanner;

public class Ex01_08 {

	public static void main(String[] args) {
		// Q8. ���콺�� ���� ����� �̿��Ͽ� 1���� n������ ���� ���� ���ϴ� ���α׷��� �ۼ�
		Scanner scan = new Scanner(System.in);
	    
		System.out.println("1���� n������ ��");
		System.out.print("n�� ����");
		int n = scan.nextInt();
	    scan.close();
	    
	    // ���� ������ ¦���� (������ ���� + 1)�� (������ ���� / 2)�� ���ϰ�
	    // Ȧ���� ��� ���� ���� = (������ ���� + 1)/2f �� ���Ѵ�.	    
	    int result = (n + 1) * (n / 2);;
	    if(n % 2 != 0) {
	    	result += (n + 1) / 2;
	    }
	    System.out.println("1���� " + n + "������ �� : " + result);
	}
}
