package ch01;

import java.util.Scanner;

public class Ex01_10 {
	
	// Q10. �� ���� a, b�� ������ �Է��ϰ� b-a�� ����ϴ� ���α׷��� �ۼ� 
	// ��, ���� b�� �Է��� ���� a ���ϸ� ���� b�� ���� �ٽ� �Է¹���
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
		System.out.print("a �� : ");
		int a = scan.nextInt();

		int b;
		while(true) {
			System.out.print("b �� : ");
			b = scan.nextInt();
			if(b > a) break;
			System.out.println(a+"���� ū ���� �Է�");
		}
		scan.close();
		
		System.out.println("b - a = " + (b - a));
	    
	}
}
