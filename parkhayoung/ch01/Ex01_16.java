package ch01;

import java.util.Scanner;

public class Ex01_16 {
	
	// Q16. n���� �Ƕ�̵带 ����ϴ� �޼��� �ۼ�
	public static void spira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n-1; j>=i; j--) {
				System.out.print(" ");	// ����
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		do {
			System.out.print("�ܼ��� ��");
			n = scan.nextInt();
		} while (n <= 0);
		scan.close();
		
		spira(n); 	
	}
}
