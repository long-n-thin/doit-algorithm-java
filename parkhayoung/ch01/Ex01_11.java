package ���Ͽ�.ch01;

import java.util.Scanner;

public class Ex01_11 {
	
	// Q11. ���� ������ �Է��ϰ� �ڸ����� ����ϴ� ���α׷��� �ۼ� 
	// 135�� �Է��ϸ� ���� ���� 3�ڸ��Դϴ١���� ���
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
		System.out.println("=== ���� ������ �ڸ��� ���ϱ� ===");
		System.out.print("���� ������ : ");
		int n = scan.nextInt();
		scan.close();
		
		int count = 0;
		while(n > 0) {
			n /= 10;
			count++;
		}
		
		System.out.println("�� ���� " + count + "�ڸ� �Դϴ�.");
	}
}
