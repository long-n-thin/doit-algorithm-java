package ch01;

import java.util.Scanner;

public class Exercise08 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ��: ");
		
		int n = scan.nextInt();
		
		int sum = 0;
		int j = n;
		
		for(int i = 1; i<=n; i++) {
			// (1+n)+(2+(n-1))+(3+(n-2)) ..
			sum += (i+j);
			
			j--;
		}
		
		// �� �� �������Ƿ� ������ 2
		System.out.print((sum/2));
		
		// int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); but �� ������ ����Ѵٰ� ��.. ����?
	}
}
