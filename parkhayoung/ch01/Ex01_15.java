package ���Ͽ�.ch01;

import java.util.Scanner;

public class Ex01_15 {
	
	// Q15. ���� �̵ �ﰢ���� ����ϴ� �޼��带 �ۼ�
	
	// ���� �Ʒ��� ������ �̵ �ﰢ��
	public static void triangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// ���� ���� ������ �̵ �ﰢ��
	public static void triangleLU(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// ������ ���� ������ �̵ �ﰢ��
	public static void triangleRU(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");	// ����
			}
			for(int j=1; j<=(n-i+1); j++) {
				System.out.print("*");	// *
			}
		}
	}
	
	// ������ �Ʒ��� ������ �̵ �ﰢ��
	public static void triangleRB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");	// ����
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");	// *
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̵ �ﰢ���� ����մϴ�.");
		int n;
		do {
			System.out.print("�ܼ��� ��");
			n = scan.nextInt();
		} while (n <= 0);
		scan.close();
		
		System.out.println("���� �Ʒ��� ������ �ﰢ��");
		triangleLB(n);

		System.out.println("���� ���� ������ �ﰢ��");
		triangleLU(n); 

		System.out.println("������ ���� ������ �ﰢ��");
		triangleRU(n); 

		System.out.println("������ �Ʒ��� ������ �ﰢ��");
		triangleRB(n);
	}
}
