package ch02;

import java.util.Scanner;

public class Ex02_09 {
	// Q9. ���� ���� �ϼ� ���ϱ�
	static int[][] mdays = {
						      {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// ���� �ϼ�
						      {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	// ��� �ϼ�
						  	};
	
	// ���� year���� �����ΰ�? (����: 1/ ���: 0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	// ���� �� �� ���ϱ�
	static int leftDayOfYear(int y, int m, int d) {
		while(--m != 0) {	// �ε����� m-1
			d += mdays[isLeap(y)][m-1];	// ���ޱ����� �� �� �� 
		}
		return 365 + isLeap(y) - d; // ����̸� 365�� �����̸� 366�Ͽ��� ��� �ϼ��� ����.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� ��� �ϼ��� ���մϴ�.");
		
		System.out.print("��? ");
		int year = sc.nextInt();
		System.out.print("��? ");
		int month = sc.nextInt();
		System.out.print("��? ");
		int day = sc.nextInt();
		sc.close();
		
		System.out.printf("%s���� ���ҽ��ϴ�.", leftDayOfYear(year, month, day));
	}
}
