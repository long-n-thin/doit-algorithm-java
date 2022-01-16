package ch02;

import java.util.Scanner;

public class P02_13 {
	// �ǽ����� �� �� ��� �� �� ���ϱ�
	static int[][] mdays = {
						      {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// ���� �ϼ�
						      {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	// ��� �ϼ�
						  	};
		  
	// ���� year���� �����ΰ�? (����: 1/ ���: 0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
  
	// ��� �� �� ���ϱ�
	static int dayOfYear(int y, int m, int d) {
		int days = d;	// �ϼ�
		for (int i = 1; i < m; i++)	// 1�� ~ (m-1)���� �ϼ��� ���� 
			days += mdays[isLeap(y)][i - 1];
		return days;
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
			
		System.out.printf("%s���� ����Ǿ����ϴ�.", dayOfYear(year, month, day));
	}
}