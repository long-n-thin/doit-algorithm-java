package ch01;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		
		int n = scan.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			System.out.println("loop i:  " + i);
			
			sum += i;
			
			i++;
		}
		System.out.println("finish i:  " + i);		

		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}
