package ch01;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ��: ");
		
		int n = scan.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			System.out.println("loop i:  " + i);
			
			sum += i;
			
			i++;
		}
		System.out.println("finish i:  " + i);		

		
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}
}
