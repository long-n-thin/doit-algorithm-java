package ch01;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ��: ");
		
		int n = scan.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			
			sum += i;
			
			if(i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i + " = " + sum);
		}
	}
}
