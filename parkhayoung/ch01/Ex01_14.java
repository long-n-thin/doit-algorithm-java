package ch01;

import java.util.Scanner;

public class Ex01_14 {

	// Q14. �Է��� ���� �� ������ �ϴ� ���簢���� * ��ȣ�� ����ϴ� ���α׷��� �ۼ�
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�簢���� ����մϴ�.");
		System.out.print("�� ��: ");
		int n = scan.nextInt();
		scan.close();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
